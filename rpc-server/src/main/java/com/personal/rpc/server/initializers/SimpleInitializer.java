package com.personal.rpc.server.initializers;

import com.personal.rpc.server.handlers.ServerHandler;
import com.personal.rpc.transport.protocol.protobuf.TransportMessage;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;

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

        pipeline.addLast(new ProtobufVarint32FrameDecoder())
                .addLast(new ProtobufDecoder(TransportMessage.Message.getDefaultInstance()))
                .addLast(new ProtobufVarint32LengthFieldPrepender())
                .addLast(new ProtobufEncoder());
        pipeline.addLast(new ServerHandler());
    }
}
