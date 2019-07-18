package com.personal.rpc.demo.service;

import com.personal.rpc.demo.model.Result;
import com.personal.rpc.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName UserServiceImpl
 * @Author xiaokai
 * @Description
 * @Date 2019/7/15 10:59 AM
 * @Version 1.0
 **/
public class UserServiceImpl implements IUserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public Result addUser(User user) {
//        logger.info("call service:UserServiceImpl");
//        logger.info(JSONObject.toJSONString(user));
        Result result = Result.newBuilder().setMessage("success----" + user.getName()).setCode(0).build();
        return result;
    }
}
