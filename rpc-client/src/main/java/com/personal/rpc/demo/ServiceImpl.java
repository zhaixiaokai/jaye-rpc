package com.personal.rpc.demo;

/**
 * @ClassName ServiceImpl
 * @Author xiaokai
 * @Description
 * @Date 2019/7/11 9:25 AM
 * @Version 1.0
 **/
public class ServiceImpl implements IService {
    @Override
    public String greet(String str) {
        String greet = "hello "+str;
        System.out.println(greet);
        return greet;
    }
}
