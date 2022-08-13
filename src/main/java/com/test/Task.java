package com.test;

/**
 * @description: TODO
 * @className: Task
 * @author: Chenhf
 * @date: 2022/7/15 19:06
 * @version: 1.0
 */
public class Task implements Runnable {
    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("start task" + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end task" + name);
    }

}
