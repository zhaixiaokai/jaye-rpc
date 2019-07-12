package com.personal.rpc.demo;

import com.personal.rpc.server.RpcNettyServer;

/**
 * @ClassName StartServer
 * @Author xiaokai
 * @Description
 * @Date 2019/7/10 3:49 PM
 * @Version 1.0
 **/
public class StartServer {
    public static void main(String[] args) {
        RpcNettyServer server = new RpcNettyServer(8080);
        server.serve();
    }
}
