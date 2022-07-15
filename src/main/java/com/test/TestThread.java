package com.test;

/**
 * @description: TODO
 * @className: TestThread
 * @author: Chenhf
 * @date: 2022/7/15 15:15
 * @version: 1.0
 */
public class TestThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(this.getName()+""+i);
        }
    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        t1.start();
        t2.start();
    }
}
