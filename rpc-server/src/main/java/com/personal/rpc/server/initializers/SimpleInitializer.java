package com.personal.rpc.server.initializers;

import com.personal.rpc.server.handlers.ServerHandler;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;

/**
 * @ClassName SimpleInitializer
 * @Author xiaokai
 * @Description
 * @Date 2019/7/10 2:36 PM
 * @Version 1.0
 **/
public class SimpleInitializer extends ChannelInitializer<SocketChannel> {


    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        if (socketChannel == null) {
            throw new IllegalArgumentException("socketChannel");
        }
        ChannelPipeline pipeline = socketChannel.pipeline();

        pipeline.addLast(new DelimiterBasedFrameDecoder(100000, Unpooled.copiedBuffer("$_$".getBytes())));

        pipeline.addLast(new StringDecoder());
//        pipeline.addLast(new StringEncoder());
//        pipeline.addLast(new ProtobufVarint32FrameDecoder());
////        pipeline.addLast(new ProtobufDecoder(null)); // TODO: 2019/7/10
//        pipeline.addLast(new ProtobufVarint32LengthFieldPrepender());
//        pipeline.addLast(new ProtobufEncoder());
        pipeline.addLast(new ServerHandler());
    }
}
