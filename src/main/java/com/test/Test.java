package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description: TODO
 * @className: test
 * @author: Chenhf
 * @date: 2022/7/13 21:34
 * @version: 1.0
 */
public class Test {
    //value1：线程不安全
    private static int value1 = 0;
    //value2：使用乐观锁
    private static AtomicInteger value2 = new AtomicInteger(0);
    //value3：使用悲观锁
    private static int value3 = 0;

    private static synchronized void increaseValue3() {
        value3++;
    }


    //main函数
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> integers = new ArrayList<Integer>();
        LinkedList<Object> objects = new LinkedList<Object>();
        String as = new String("as");
        StringBuffer anquan = new StringBuffer("anquan");
        StringBuilder buanquan = new StringBuilder("buanquan");
        HashSet<Integer> integers1 = new HashSet<Integer>();

        int[] arr = {-1, 2, 3, 4, -5, -6, 8, 9, 0};
        Arrays.sort(arr);
        //开启1000个线程，并执行自增操作
        for (int i = 0; i < 1000; ++i) {
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
