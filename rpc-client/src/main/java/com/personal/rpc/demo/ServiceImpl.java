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
    public void greet(String str) {
        System.out.println("hello "+str);
    }
}
