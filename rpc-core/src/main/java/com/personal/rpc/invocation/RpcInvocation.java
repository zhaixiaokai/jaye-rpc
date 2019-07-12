package com.personal.rpc.invocation;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.lang.reflect.Method;

/**
 * @ClassName RpcInvocation
 * @Author xiaokai
 * @Description
 * @Date 2019/7/11 8:52 AM
 * @Version 1.0
 **/
public class RpcInvocation implements Serializable{
    private Class<?> clazz;
    private Object object;
    private Method method;
    private Object[] args;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public String toString(){
        return JSONObject.toJSONString(this);
    }
}
