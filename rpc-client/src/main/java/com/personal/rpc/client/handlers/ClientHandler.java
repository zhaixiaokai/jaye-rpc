package com.personal.rpc.client.handlers;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @ClassName ClientHandler
 * @Author xiaokai
 * @Description
 * @Date 2019/7/10 3:37 PM
 * @Version 1.0
 **/
public class ClientHandler extends SimpleChannelInboundHandler<String> {


    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        System.out.println("client:" + String.valueOf(msg));
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, String s) throws Exception {

    }
}
