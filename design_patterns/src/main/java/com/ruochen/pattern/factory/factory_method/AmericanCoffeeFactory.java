package com.ruochen.pattern.factory.factory_method;

/**
 * 美式咖啡工厂
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
