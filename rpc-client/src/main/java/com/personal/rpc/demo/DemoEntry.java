package com.personal.rpc.demo;

import com.personal.rpc.client.RpcClientFactory;
import com.personal.rpc.client.RpcNettyClient;

/**
 * @ClassName DemoEntry
 * @Author xiaokai
 * @Description
 * @Date 2019/7/11 9:26 AM
 * @Version 1.0
 **/
public class DemoEntry {
    public static void main(String[] args) {

        RpcNettyClient nettyClient = new RpcNettyClient();
        nettyClient.doClient();
        IService client = RpcClientFactory.getClient(IService.class);
        for (int i = 0; i < 10; i++) {
            client.greet("xiaokai"+i);
        }
    }
}
