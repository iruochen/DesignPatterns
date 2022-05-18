package com.ruochen.pattern.singleton.demo4;

/**
 * 双重检查锁方式
 */
public class Singleton {
    private Singleton() {

    }

    // volatile 保证指令有序性
    private static volatile Singleton instance;

    public static Singleton getInstance() {
        // 第一次判断
        if (instance == null) {
            synchronized (Singleton.class) {
                // 第二次判断
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
