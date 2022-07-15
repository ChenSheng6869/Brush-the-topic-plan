package com.test;

import java.util.concurrent.*;

/**
 * @description: 线程池执行线程
 * @className: ThreadPoolTest
 * @author: Chenhf
 * @date: 2022/7/15 18:36
 * @version: 1.0
 */
public class ThreadPoolTest {


    public static void main(String[] args) {
        //创建固定大小的线程池
        int min = 4;
        int max = 10;
        ExecutorService executor = Executors.newFixedThreadPool(4);
        //创建动态线程池
        ExecutorService executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        for (int i = 0; i < 6; i++) {
            executorService.submit(new Task(""+i));
        }
        executorService.shutdown();
    }
}



