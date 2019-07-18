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
    private long timeout;
    private int retryTime;

    public RpcInvocationHandler(Class iService) {
        this.iService = iService;
        this.retryTime = 0;
        this.timeout = 3000;
    }

    public RpcInvocationHandler(Class iService, long timeout) {

        this.iService = iService;
        this.retryTime = 0;
        this.timeout = timeout;
    }

    public RpcInvocationHandler(Class iService, long timeout, int retryTime) {
        this.iService = iService;
        this.timeout = timeout;
        this.retryTime = retryTime;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        List<String> argType = new LinkedList<>();
        List<Any> argVal = new LinkedList<>();
        if (args != null) {
            for (Object arg : args) {
                if(arg instanceof Message){
                    argVal.add(Any.pack((Message) arg));
                }
                argType.add(arg.getClass().getName());
            }
        }
        return RpcNettyClient.getInstance().doRequest(iService, method, argType, argVal,this.timeout);
    }


    public Class getiService() {
        return iService;
    }

    public void setiService(Class iService) {
        this.iService = iService;
    }
}
