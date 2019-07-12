package com.personal.rpc.client.handlers;

import com.personal.rpc.client.util.CallUtil;
import com.personal.rpc.invocation.RpcInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName RpcInvocationHandler
 * @Author xiaokai
 * @Description
 * @Date 2019/7/11 9:01 AM
 * @Version 1.0
 **/
public class RpcInvocationHandler<T> implements InvocationHandler {

    Logger logger = LoggerFactory.getLogger(RpcInvocationHandler.class);
    private Class iService;


    public RpcInvocationHandler(Class<T> clazz){
        this.iService = clazz;
    }

    @Override
    public T invoke(Object proxy, Method method, Object[] args) throws Throwable {
        RpcInvocation invocation = new RpcInvocation();
        invocation.setArgs(args);
        invocation.setMethod(method);
        invocation.setObject(proxy);
        invocation.setClazz(iService);

        CallUtil.putTask(invocation);
        return null;
    }


    public Class getiService() {
        return iService;
    }

    public void setiService(Class iService) {
        this.iService = iService;
    }
}