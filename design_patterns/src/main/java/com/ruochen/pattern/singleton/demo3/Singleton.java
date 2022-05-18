package com.ruochen.pattern.singleton.demo3;

/**
 * 懒汉式：线程不安全
 */
public class Singleton {

    // 私有构造方法
    private Singleton() {
    }

    // 声明Singleton类型的变量
    private static Singleton instance;  // 只是声明，没有进行赋值

    // 对外提供访问方式
    public static synchronized Singleton getInstance() {
        // 判断instance是否为null，如果为null，说明未创建Singleton类对象
        // 如果未创建，创建并返回；若不为null，直接返回
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
