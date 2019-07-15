package com.personal.rpc.server.handlers;

import com.personal.rpc.transport.protocol.protobuf.RpcTransportRequest;
import com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName ServerHandler
 * @Author xiaokai
 * @Description
 * @Date 2019/7/10 2:41 PM
 * @Version 1.0
 **/
public class ServerHandler extends SimpleChannelInboundHandler<Object> {
    private final static Logger logger = LoggerFactory.getLogger(ServerHandler.class);
    private RpcTransportRequest.Request request;
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        logger.debug(String.valueOf(msg));
        RpcTransportRequest.Request request = (RpcTransportRequest.Request) msg;
        this.request = request;
        RpcTransportResponse.Response response = RpcTransportResponse.Response.newBuilder()
                .setResult(true)
                .setUid(request.getUid())
                .setErrMessage(null).build();
        ctx.writeAndFlush(response);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        RpcTransportResponse.Response response = RpcTransportResponse.Response.newBuilder()
                .setUid(request.getUid())
                .setResult(false)
                .setErrMessage(cause.getMessage())
                .build();
        cause.printStackTrace();
        ctx.close();
    }
}
