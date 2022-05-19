package com.ruochen.pattern.singleton.demo7;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.io.*;

/**
 * 测试反射破坏单例模式
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // writeObject2File();
        // 运行两次后发现地址不同，破坏了单例模式
        readObjectFromFile();
        readObjectFromFile();
    }

    // 向文件中写数据（对象）
    public static void writeObject2File() throws Exception {
        // 1. 获取Singleton对象
        Singleton instance = Singleton.getInstance();
        // 2. 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ruochen\\Desktop\\a.txt"));
        // 3. 写对象
        oos.writeObject(instance);
        // 4. 释放资源
        oos.close();
    }

    // 从文件中读数据（对象）
    public static void readObjectFromFile() throws Exception {
        // 1. 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\ruochen\\Desktop\\a.txt"));
        // 2. 读取对象
        Singleton instance = (Singleton) ois.readObject();
        System.out.println(instance);
        // 3. 释放资源
        ois.close();
    }
}
