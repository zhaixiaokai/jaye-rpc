package com.personal.rpc.client.handlers;

import com.personal.rpc.client.RpcNettyClient;
import com.personal.rpc.client.util.SyncUtil;
import com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName ClientHandler
 * @Author xiaokai
 * @Description
 * @Date 2019/7/10 3:37 PM
 * @Version 1.0
 **/
public class ClientHandler extends SimpleChannelInboundHandler<Object> {


    Logger logger = LoggerFactory.getLogger(ClientHandler.class);
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        logger.debug(String.valueOf(msg));
        if(msg instanceof RpcTransportResponse.Response){
            RpcTransportResponse.Response response = (RpcTransportResponse.Response) msg;
            RpcNettyClient.saveResponse(response);
            CountDownLatch latch = SyncUtil.getLatch(response.getUid());
            latch.countDown();
        }else{
            logger.error("返回的数据类型不符合通信协议");
        }

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object s) throws Exception {

    }
}
