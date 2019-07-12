package com.personal.rpc.client.handlers;

import com.personal.rpc.client.initializers.SimpleClientInitilizer;
import io.netty.channel.Channel;
import io.netty.channel.pool.ChannelPoolHandler;
import io.netty.channel.socket.SocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName RpcNettyChannelPoolHandler
 * @Author xiaokai
 * @Description
 * @Date 2019/7/12 11:58 AM
 * @Version 1.0
 **/
public class NettyChannelPoolHandler implements ChannelPoolHandler {
    Logger logger = LoggerFactory.getLogger(NettyChannelPoolHandler.class);

    @Override
    public void channelReleased(Channel channel) throws Exception {
        logger.debug("release channel : {}", channel);
    }

    @Override
    public void channelAcquired(Channel channel) throws Exception {
        logger.debug("acquire channel : {}", channel);
    }

    @Override
    public void channelCreated(Channel channel) throws Exception {
        logger.debug("create channel : {}", channel);
        SocketChannel ch = (SocketChannel) channel;
        SimpleClientInitilizer initializer = new SimpleClientInitilizer();
        initializer.doInit(ch);
    }
}
