package com.personal.rpc.client.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ClientTaskExecutor
 * @Author xiaokai
 * @Description
 * @Date 2019/7/11 4:41 PM
 * @Version 1.0
 **/
public class ClientTaskExecutor {

    private static ClientTaskExecutor instance;
    private static ExecutorService executor = Executors.newCachedThreadPool();
    private ClientTaskExecutor(){

    }
    public static ClientTaskExecutor getInstance(){
        if(instance == null){
            synchronized (ClientTaskExecutor.class){
                if(instance == null){
                    instance = new ClientTaskExecutor();
                }
            }
        }
        return instance;
    }

    public static void doTask(Runnable task){
        ClientTaskExecutor.executor.submit(task);
    }
}
