package com.personal.rpc.client;

import com.personal.rpc.client.handlers.NettyChannelPoolHandler;
import com.personal.rpc.transport.protocol.protobuf.TransportMessage;
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

    public void doRequest() {
        try {
            FixedChannelPool pool = poolMap.get(new InetSocketAddress("127.0.0.1", 8080));

            Future<Channel> future = pool.acquire();

            final FixedChannelPool finalPool = pool;
            future.addListener(new FutureListener<Channel>() {

                @Override
                public void operationComplete(Future<Channel> future) throws Exception {
                    if (future.isSuccess()) {
                        Channel channel = (Channel) future.getNow();
                        TransportMessage.Message msg = TransportMessage.Message.newBuilder().setClassName("com.xiaokai.test").setMethodName("sayhello").addAllArgs(new ArrayList<>()).build();
                        channel.writeAndFlush(msg);
                        finalPool.release(channel);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
