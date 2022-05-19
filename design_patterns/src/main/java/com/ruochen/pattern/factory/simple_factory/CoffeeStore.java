package com.ruochen.pattern.factory.simple_factory;

public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(type);

        // 加配料
        coffee.addSugar();
        coffee.addMilk();

        return coffee;
    }
}
