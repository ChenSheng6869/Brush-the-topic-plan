package com.gof;

/**
 * @description: DCL单例模式
 * @className: Hungry
 * @author: Chenhf
 * @date: 2022/7/15 16:24
 * @version: 1.0
 */
public class Hungry {
    private static Hungry HUNGRY;
    private Hungry(){
    }

    public static Hungry getHUNGRY(){
        if (HUNGRY == null){
            synchronized (Hungry.class){
                if (HUNGRY == null){
                    HUNGRY = new Hungry();
                    return HUNGRY;
                }
            }
        }
        return HUNGRY;
    }
}
