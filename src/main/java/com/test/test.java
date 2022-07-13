package com.test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description: TODO
 * @className: test
 * @author: Chenhf
 * @date: 2022/7/13 21:34
 * @version: 1.0
 */
public class test {
    //value1：线程不安全
    private static int value1 = 0;
    //value2：使用乐观锁
    private static AtomicInteger value2 = new AtomicInteger(0);
    //value3：使用悲观锁
    private static int value3 = 0;
    private static synchronized void increaseValue3(){
        value3++;
    }

    //main函数
    public static void main(String[] args) throws InterruptedException {
        //开启1000个线程，并执行自增操作
        for(int i = 0; i < 1000; ++i){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //value1不安全
                    value1++;
                    value2.getAndIncrement();
                    increaseValue3();
                }
            }).start();
        }
        Thread.sleep(1000);
        System.out.println("线程不安全：" + value1);
        System.out.println("乐观锁(AtomicInteger)：" + value2);
        System.out.println("悲观锁(synchronized)：" + value3);
    }
}
