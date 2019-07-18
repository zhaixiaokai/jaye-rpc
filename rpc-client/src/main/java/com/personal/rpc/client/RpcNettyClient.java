package com.personal.rpc.client;

import com.google.protobuf.Any;
import com.personal.rpc.client.exception.RpcCallException;
import com.personal.rpc.client.handlers.NettyChannelPoolHandler;
import com.personal.rpc.client.util.SyncUtil;
import com.personal.rpc.transport.protocol.protobuf.RpcTransportRequest;
import com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.pool.AbstractChannelPoolMap;
import io.netty.channel.pool.ChannelPoolMap;
import io.netty.channel.pool.FixedChannelPool;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.FutureListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName RpcClient
 * @Author xiaokai
 * @Description
 * @Date 2019/7/10 3:19 PM
 * @Version 1.0
 **/
public class RpcNettyClient<T> {
    private final static Logger logger = LoggerFactory.getLogger(RpcNettyClient.class);
    private final static Long LAST_TERM = 60000L;
    private ChannelPoolMap<InetSocketAddress, FixedChannelPool> poolMap;

    private static ConcurrentHashMap<String, RpcTransportResponse.Response> RESPONSE_MAP = new ConcurrentHashMap<>();
    private static RpcNettyClient instance = new RpcNettyClient();
    private Bootstrap bootStarp;

    private RpcNettyClient() {
        this.bootStarp = new Bootstrap();
        poolMap = new AbstractChannelPoolMap<InetSocketAddress, FixedChannelPool>() {
            @Override
            protected FixedChannelPool newPool(InetSocketAddress inetSocketAddress) {
                return new FixedChannelPool(bootStarp.remoteAddress(inetSocketAddress), new NettyChannelPoolHandler(), 5);
            }
        };
        EventLoopGroup group = new NioEventLoopGroup();
        bootStarp.group(group).channel(NioSocketChannel.class);
        initGcThread();
    }

    private void initGcThread() {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                logger.info("执行内存回收,清除已超时的响应...");
                Iterator it = RESPONSE_MAP.entrySet().iterator();
                Long now = System.currentTimeMillis();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    try {

                        RpcTransportResponse.Response rsp = (RpcTransportResponse.Response) entry.getValue();
                        if (rsp != null && rsp.getTimestamp() != 0L) {
                            // 超过期限的数清理掉
                            if (now - rsp.getTimestamp() > LAST_TERM) {
                                RESPONSE_MAP.remove(entry.getKey());
                            }
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }, 5, 5, TimeUnit.SECONDS);

    }

    public static RpcNettyClient getInstance() {
        return instance;
    }

    public <T> T doRequest(Class clazz, Method method, List<String> argType, List<? extends Any> args, long timeout) {
        Class returnClass = method.getReturnType();
        String uuid = UUID.randomUUID().toString();
        try {
            FixedChannelPool pool = poolMap.get(new InetSocketAddress("127.0.0.1", 8080));
            Future<Channel> future = pool.acquire();
            final FixedChannelPool finalPool = pool;

            RpcTransportRequest.Request request = RpcTransportRequest.Request.newBuilder()
                    .setUid(uuid)
                    .setClassName(clazz.getName())
                    .setMethodName(method.getName())
                    .addAllArgsType(argType)
                    .addAllArgsValue(args)
                    .setTimestamp(System.currentTimeMillis())
                    .build();
            future.addListener(new FutureListener<Channel>() {
                @Override
                public void operationComplete(Future<Channel> future) throws Exception {
                    if (future.isSuccess()) {
                        Channel channel = future.getNow();
                        channel.writeAndFlush(request);
                        finalPool.release(channel);
                        logger.info("调用远程接口:{}.{},args:{}", clazz.getSimpleName(), method.getName(), args);
                    }
                }
            });
            SyncUtil.setLatchAndWait(uuid, 1, timeout);
//            if (SyncUtil.getLatch(uuid).getCount() > 0) {
//                logger.info("调用超时:{}.{},args:{}", clazz.getSimpleName(), method.getName(), args);
//                SyncUtil.deleteLatch(uuid);
//                throw new RpcCallException("调用超时:" + clazz.getSimpleName() + "." + method.getName());
//            }
            logger.info("当前缓存Response数量为:{}",RESPONSE_MAP.size());
            if (RESPONSE_MAP != null && RESPONSE_MAP.get(uuid) != null && RESPONSE_MAP.get(uuid).getBody() != null) {
                Any responseBody = RESPONSE_MAP.get(uuid).getBody();
                RESPONSE_MAP.remove(uuid);
                // TODO: 2019/7/15   需要定时任务清理RESPONSE_MAP中的内容
                return (T) responseBody.unpack(returnClass);
            }
            return null;
        } catch (Exception e) {
            logger.error("调用发生异常:{}", e.getMessage());
            throw new RpcCallException(e.getMessage());
        }
    }

    public static void saveResponse(RpcTransportResponse.Response message) {
        if (message != null && message.getUid() != null) {
            RESPONSE_MAP.put(message.getUid(), message);
        }
    }

    private <T> T get() {
        return null;
    }
}
