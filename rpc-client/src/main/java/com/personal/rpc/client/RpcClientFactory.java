package com.personal.rpc.client;

import com.personal.rpc.client.handlers.RpcInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @ClassName RpcClientUtil
 * @Author xiaokai
 * @Description
 * @Date 2019/7/11 8:58 AM
 * @Version 1.0
 **/
public class RpcClientFactory {
    public static <I> I getClient(Class iService,long timeout,int retryTime) {
        I proxy = (I) Proxy.newProxyInstance(RpcClientFactory.class.getClassLoader(), new Class<?>[]{iService}, new RpcInvocationHandler(iService,timeout,retryTime));
        return proxy;
    }

    public static <I> I getClient(Class iService,long timeout) {
        I proxy = (I) Proxy.newProxyInstance(RpcClientFactory.class.getClassLoader(), new Class<?>[]{iService}, new RpcInvocationHandler(iService,timeout));
        return proxy;
    }

    public static <I> I getClient(Class iService) {
        I proxy = (I) Proxy.newProxyInstance(RpcClientFactory.class.getClassLoader(), new Class<?>[]{iService}, new RpcInvocationHandler(iService));
        return proxy;
    }
}
