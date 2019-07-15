package com.personal.rpc.demo;

import com.personal.rpc.client.RpcClientFactory;

import java.io.IOException;

/**
 * @ClassName DemoEntry
 * @Author xiaokai
 * @Description
 * @Date 2019/7/11 9:26 AM
 * @Version 1.0
 **/
public class DemoEntry {
    public static void main(String[] args) throws IOException {

        IService client = RpcClientFactory.getClient(IService.class);
        for (int i = 0; i < 10; i++) {
            try{
                String ret = client.greet("xiaokai"+i);
                System.out.println("###########"+ret);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.in.read();
    }
}
