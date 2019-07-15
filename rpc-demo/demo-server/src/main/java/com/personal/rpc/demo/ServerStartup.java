package com.personal.rpc.demo;

import com.personal.rpc.demo.service.IUserService;
import com.personal.rpc.demo.service.UserServiceImpl;
import com.personal.rpc.register.RpcServiceResisterCache;
import com.personal.rpc.server.RpcNettyServer;

import java.net.InetSocketAddress;

/**
 * @ClassName ServerStartup
 * @Author xiaokai
 * @Description
 * @Date 2019/7/15 10:43 AM
 * @Version 1.0
 **/
public class ServerStartup {
    public static void main(String[] args) {
        RpcNettyServer server = new RpcNettyServer(8080);
        InetSocketAddress address = new InetSocketAddress("127.0.0.1",8080);
        RpcServiceResisterCache.putService(address,IUserService.class,new UserServiceImpl ());
        server.serve();

    }
}
