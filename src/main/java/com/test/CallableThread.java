package com.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @description: 1.实现Called接口, 重写call方法, call方法中的内容有需要线程完成的任务,且有返回值
 * 2.创建任务类对象,使用FutureTask类包装任务类对象
 * 3.任务类需要再线程中执行,FutureTask类对象作为参数参入Thread
 * 4.调用start方法,启动线程
 * 5.调用FutureTask类对象get方法获取线程执行返回的值(call方法的返回值)
 * @className: CallableThread
 * @author: Chenhf
 * @date: 2022/7/15 15:26
 * @version: 1.0
 */
public class CallableThread implements Callable<Integer> {
    @Override
    public Integer call() {
        int i = 0;
        for (i = 0; i < 20; i++) {
            if (i == 5)
                break;
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        return i;
    }

    public static void main(String[] args) {
        CallableThread t1 = new CallableThread();
        FutureTask<Integer> ft = new FutureTask<Integer>(t1);
        Thread t = new Thread(ft);
        t.start();
        try {
            System.out.println(Thread.currentThread().getName() + " " + ft.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
