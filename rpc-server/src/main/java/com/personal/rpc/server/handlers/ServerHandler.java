package com.personal.rpc.server.handlers;

import com.alibaba.fastjson.JSONObject;
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
        ctx.writeAndFlush(JSONObject.toJSONString(msg));
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
