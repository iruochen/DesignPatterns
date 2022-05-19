package com.ruochen.pattern.factory.factory_method;

/**
 * 拿铁咖啡工厂
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
