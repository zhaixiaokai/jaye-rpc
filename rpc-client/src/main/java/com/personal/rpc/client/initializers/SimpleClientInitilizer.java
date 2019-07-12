package com.personal.rpc.client.initializers;

import com.personal.rpc.client.handlers.ClientHandler;
import com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;

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

        pipeline.addLast(new ProtobufVarint32FrameDecoder())
                .addLast(new ProtobufDecoder(RpcTransportResponse.Response.getDefaultInstance()))
                .addLast(new ProtobufVarint32LengthFieldPrepender())
                .addLast(new ProtobufEncoder());

        pipeline.addLast(new ClientHandler());
    }

    public void doInit(SocketChannel socketChannel) throws Exception {
        this.initChannel(socketChannel);
    }
}
