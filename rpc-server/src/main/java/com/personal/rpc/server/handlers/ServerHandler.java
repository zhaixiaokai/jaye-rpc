package com.personal.rpc.server.handlers;

import com.alibaba.fastjson.JSONObject;
import com.personal.rpc.transport.protocol.protobuf.TransportMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @ClassName ServerHandler
 * @Author xiaokai
 * @Description
 * @Date 2019/7/10 2:41 PM
 * @Version 1.0
 **/
public class ServerHandler extends SimpleChannelInboundHandler<Object> {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {

        System.err.println("server:" + JSONObject.toJSONString(msg));
        TransportMessage.Message message = (TransportMessage.Message) msg;
        System.out.println(message.getClassName());
        System.out.println(message.getArgsList());
        System.out.println(message.getMethodName());
        ctx.writeAndFlush(msg);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
