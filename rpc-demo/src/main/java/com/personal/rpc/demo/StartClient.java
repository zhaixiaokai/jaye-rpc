package com.personal.rpc.demo;

import com.personal.rpc.client.RpcNettyClient;

/**
 * @ClassName StartClient
 * @Author xiaokai
 * @Description
 * @Date 2019/7/10 3:49 PM
 * @Version 1.0
 **/
public class StartClient {
    public static void main(String[] args) {
        RpcNettyClient client = new RpcNettyClient();
        client.doClient();
    }
}
