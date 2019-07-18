package com.personal.rpc.demo;

import com.personal.rpc.client.RpcClientFactory;
import com.personal.rpc.demo.model.Result;
import com.personal.rpc.demo.model.User;
import com.personal.rpc.demo.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName ServerStartup
 * @Author xiaokai
 * @Description
 * @Date 2019/7/15 10:41 AM
 * @Version 1.0
 **/
public class ClientStartup {
    private static Logger logger = LoggerFactory.getLogger(ClientStartup.class);

    public static void main(String[] args) throws InterruptedException {

        while(true){

            IUserService service = RpcClientFactory.getClient(IUserService.class,1000);
            Long start = System.currentTimeMillis();
            User user = User.newBuilder().setEmail("zhaijiayu@163.com").setGender(1).setName("################" + Thread.currentThread().getName()).build();
            Result result = service.addUser(user);
            logger.info("main result:{}", result);
            Long end = System.currentTimeMillis();
            System.err.println("执行[" + Thread.currentThread().getName() + "]耗时" + (end - start) + "毫秒,结果为:"+result);
            System.err.println();
            Thread.sleep(1000);
        }
//        for (int i = 0; i < 1; i++) {
//            Thread t = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                }
//            });
//            t.start();
//        }
    }

}
