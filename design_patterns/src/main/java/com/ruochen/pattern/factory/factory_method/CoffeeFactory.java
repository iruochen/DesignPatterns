package com.ruochen.pattern.factory.factory_method;

/**
 * 抽象咖啡工厂类
 */
public interface CoffeeFactory {
    // 创建咖啡对象方法
    Coffee createCoffee();
}
