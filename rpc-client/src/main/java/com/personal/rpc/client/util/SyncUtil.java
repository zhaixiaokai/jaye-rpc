package com.personal.rpc.client.util;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName SyncUtil
 * @Author xiaokai
 * @Description
 * @Date 2019/7/12 4:31 PM
 * @Version 1.0
 **/
public class SyncUtil {
    private static ConcurrentHashMap<String, CountDownLatch> latchMap = new ConcurrentHashMap<>();

    public static CountDownLatch setLatch(String key, int count) {
        if (key != null && key.length() > 0) {
            CountDownLatch latch = new CountDownLatch(count);
            latchMap.put(key, latch);
            return latch;
        }
        return null;
    }

    public static void setLatchAndWait(String key, int count) throws InterruptedException {
        setLatchAndWait(key, count, 10);
    }

    public static void setLatchAndWait(String key, int count, long timeout) throws InterruptedException {
        setLatchAndWait(key, count, timeout, TimeUnit.SECONDS);
    }

    public static void setLatchAndWait(String key, int count, long timeout, TimeUnit timeUnit) throws InterruptedException {
        CountDownLatch latch = setLatch(key, count);
        latch.await(timeout, timeUnit);
    }

    public static CountDownLatch getLatch(String key) {
        return latchMap.get(key);
    }
}
