package com.personal.rpc.server.handlers;

import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.personal.rpc.register.RpcServiceResisterCache;
import com.personal.rpc.transport.protocol.protobuf.RpcTransportRequest;
import com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.util.List;

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
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InvalidProtocolBufferException {
        logger.debug(String.valueOf(msg));
        RpcTransportRequest.Request request = (RpcTransportRequest.Request) msg;
        this.request = request;

        String uid = request.getUid();
        Class clazz = Class.forName(request.getClassName());
        List<String> argTypeStr = request.getArgsTypeList();
        Class<?>[] argTypeClass = new Class<?>[argTypeStr.size()];
        for (int i = 0; i < argTypeStr.size(); i++) {
            argTypeClass[i] = Class.forName(argTypeStr.get(i));
        }
        Method method = clazz.getMethod(request.getMethodName(), argTypeClass);

        InetSocketAddress address = new InetSocketAddress("127.0.0.1",8080);
        Object obj = RpcServiceResisterCache.getService(address,clazz);

        List<Any> args = request.getArgsValueList();
        Object[] argsArray = new Object[args.size()];
        for(int i=0;i<args.size();i++) {
            Class cl = argTypeClass[i];
            argsArray[i] = args.get(i).unpack(cl);
        }

        Object ret = method.invoke(obj,argsArray);

        RpcTransportResponse.Response response = RpcTransportResponse.Response.newBuilder()
                .setResult(true)
                .setUid(uid)
                .setBody(Any.pack((Message) ret))
                .setErrMessage("").build();
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
                .setErrMessage(cause.toString())
                .build();
        cause.printStackTrace();
        ctx.close();
    }
}
