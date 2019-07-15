package com.personal.rpc.register;

import java.net.InetSocketAddress;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName RpcServiceResisterMap
 * @Author xiaokai
 * @Description
 * @Date 2019/7/15 1:56 PM
 * @Version 1.0
 **/
public class RpcServiceResisterCache {
    private static ConcurrentHashMap<String, Object> serviceMap = new ConcurrentHashMap<String, Object>();
    private final static String DELIMITER = ":";
    private static String getKey(InetSocketAddress address, Class clazz){
        StringBuilder sb = new StringBuilder();
        sb.append(address.getAddress().getHostAddress())
                .append(DELIMITER)
                .append(address.getPort())
                .append(DELIMITER)
                .append(clazz.toString());
        return sb.toString();
    }
    public static synchronized void putService(InetSocketAddress address,Class clazz,Object impl){
        if(null == address){
            throw new IllegalArgumentException("address");
        }
        if(null == clazz){
            throw new IllegalArgumentException("clazz");
        }

        serviceMap.put(getKey(address,clazz),impl);
    }
    public static <T> T getService(InetSocketAddress address,Class<T> clazz){
        return (T) serviceMap.get(getKey(address,clazz));
    }
}
