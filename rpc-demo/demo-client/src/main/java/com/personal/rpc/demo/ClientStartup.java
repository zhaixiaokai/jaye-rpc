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
    private  static Logger logger = LoggerFactory.getLogger(ClientStartup.class);
    public static void main(String[] args) {

        IUserService service = RpcClientFactory.getClient(IUserService.class);
        User user = User.newBuilder().setEmail("zhaijiayu@163.com").setGender(1).setName("xiaokai").build();
        Result result = service.addUser(user);
        logger.info("main result:{}",result);
    }

}
