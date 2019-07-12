package com.personal.rpc.client.util;

import com.personal.rpc.invocation.RpcInvocation;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @ClassName CallUtil
 * @Author xiaokai
 * @Description
 * @Date 2019/7/11 10:29 AM
 * @Version 1.0
 **/
public class CallUtil {
    private static ConcurrentLinkedDeque<RpcInvocation> TASK_QUEUE = new ConcurrentLinkedDeque<>();

    public static void putTask(RpcInvocation invocation){
        TASK_QUEUE.add(invocation);
    }

    public static RpcInvocation getTask(){
        return TASK_QUEUE.removeFirst();
    }

    public static int getQuereSize(){
        return TASK_QUEUE.size();
    }
}
