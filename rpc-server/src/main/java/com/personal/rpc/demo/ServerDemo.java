package com.personal.rpc.demo;

import com.personal.rpc.server.RpcNettyServer;

/**
 * @ClassName ServerDemo
 * @Author xiaokai
 * @Description
 * @Date 2019/7/11 5:02 PM
 * @Version 1.0
 **/
public class ServerDemo {
    public static void main(String[] args) {
        RpcNettyServer server = new RpcNettyServer(8080);
        server.serve();
    }
}
