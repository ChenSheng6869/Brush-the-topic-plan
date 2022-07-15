package com.gof;

/**
 * @description: 饿汉式单例模式
 * @className: Hungry
 * @author: Chenhf
 * @date: 2022/7/15 16:24
 * @version: 1.0
 */
public class Hungry {

    private Hungry(){

    }
    private final static Hungry HUNGRY = new Hungry();
    public static Hungry getInstance(){
        return HUNGRY;
    }
}
