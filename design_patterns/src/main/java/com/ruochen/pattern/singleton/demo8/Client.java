package com.ruochen.pattern.singleton.demo8;

import java.lang.reflect.Constructor;

/**
 * 测试反射破坏单例模式
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 1. 获取Singleton的字节码对象
        Class clazz = Singleton.class;
        // 2. 获取无参构造方法对象
        Constructor cons = clazz.getDeclaredConstructor();
        // 3. 取消访问检查
        cons.setAccessible(true);
        // 4. 创建Singleton对象
        Singleton s1 = (Singleton) cons.newInstance();
        Singleton s2 = (Singleton) cons.newInstance();

        // 若返回true，说明未破坏单例模式；否则，破坏了单例模式
        System.out.println(s1 == s2);
    }
}
