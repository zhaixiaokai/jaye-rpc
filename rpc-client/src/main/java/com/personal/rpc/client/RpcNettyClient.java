package com.personal.rpc.client;

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

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName RpcClient
 * @Author xiaokai
 * @Description
 * @Date 2019/7/10 3:19 PM
 * @Version 1.0
 **/
public class RpcNettyClient {
    private final static Logger logger = LoggerFactory.getLogger(RpcNettyClient.class);
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
    }

    public static RpcNettyClient getInstance() {
        return instance;
    }

    public <T> T doRequest() {

        String uuid = UUID.randomUUID().toString();
        try {
            FixedChannelPool pool = poolMap.get(new InetSocketAddress("127.0.0.1", 8080));
            Future<Channel> future = pool.acquire();
            final FixedChannelPool finalPool = pool;

            RpcTransportRequest.Request request = RpcTransportRequest.Request.newBuilder().setUid(uuid).
                    setClassName("com.xiaokai.test").
                    setMethodName("sayhello").
                    addAllArgsType(new ArrayList<>()).
                    addAllArgsValue(new ArrayList<>()).
                    build();
            future.addListener(new FutureListener<Channel>() {
                @Override
                public void operationComplete(Future<Channel> future) throws Exception {
                    if (future.isSuccess()) {
                        Channel channel = future.getNow();
                        channel.writeAndFlush(request);
                        finalPool.release(channel);
                        System.out.println("调用发送成功...");
                    }
                }
            });
            SyncUtil.setLatchAndWait(uuid,1);

            System.out.println("该干啥干啥");
            return (T) RESPONSE_MAP.get(uuid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void saveResponse(RpcTransportResponse.Response message) {
        if (message != null && message.getUid() != null) {
            RESPONSE_MAP.put(message.getUid(),message);
        }
    }

    private <T> T get(){
        return null;
    }
}
