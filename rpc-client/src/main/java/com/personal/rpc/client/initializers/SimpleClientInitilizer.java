package com.personal.rpc.client.initializers;

import com.personal.rpc.client.handlers.ClientHandler;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * @ClassName SimpleClientInitilizer
 * @Author xiaokai
 * @Description
 * @Date 2019/7/10 3:34 PM
 * @Version 1.0
 **/
public class SimpleClientInitilizer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        if (socketChannel == null) {
            throw new IllegalArgumentException("socketChannel");
        }
        ChannelPipeline pipeline = socketChannel.pipeline();

        pipeline.addLast(new DelimiterBasedFrameDecoder(100000, Unpooled.copiedBuffer("$_$".getBytes())));
        pipeline.addLast(new StringDecoder());
        pipeline.addLast(new StringEncoder());
//        pipeline.addLast(new ProtobufDecoder(null));// TODO: 2019/7/10
//        pipeline.addLast(new ProtobufVarint32LengthFieldPrepender());
        pipeline.addLast(new ClientHandler());
    }
}
