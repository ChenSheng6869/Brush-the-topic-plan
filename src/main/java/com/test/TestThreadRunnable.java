package com.test;

/**
 * @description: TODO
 * @className: TestThreadRunnable
 * @author: Chenhf
 * @date: 2022/7/15 15:18
 * @version: 1.0
 */
public class TestThreadRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "" + i);
        }
    }

    public static void main(String[] args) {
        TestThreadRunnable t1 = new TestThreadRunnable();
        TestThreadRunnable t2 = new TestThreadRunnable();

        Thread tt1 = new Thread(t1);
        Thread tt2 = new Thread(t2);

        tt1.start();
        tt2.start();
    }
}
