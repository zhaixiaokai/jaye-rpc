package com.personal.rpc.client.handlers;

import com.google.protobuf.Any;
import com.google.protobuf.Message;
import com.personal.rpc.client.RpcNettyClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName RpcInvocationHandler
 * @Author xiaokai
 * @Description
 * @Date 2019/7/11 9:01 AM
 * @Version 1.0
 **/
public class RpcInvocationHandler implements InvocationHandler {

    Logger logger = LoggerFactory.getLogger(RpcInvocationHandler.class);
    private Class iService;


    public RpcInvocationHandler(Class clazz) {
        this.iService = clazz;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        List<String> argType = new LinkedList<>();
        List<Any> argVal = new LinkedList<>();
        if (args != null) {
            for (Object arg : args) {
                logger.debug("校验参数类型:{}", arg);
//                if (arg instanceof Message) {
                    argVal.add(Any.pack((Message) arg));
                    argType.add(arg.getClass().getName());
//                }
//                throw new RpcCallException("参数必须是Protobuf对应的类");
            }
        }
        return RpcNettyClient.getInstance().doRequest(iService, method, argType, argVal);
    }


    public Class getiService() {
        return iService;
    }

    public void setiService(Class iService) {
        this.iService = iService;
    }
}
