package com.ruochen.pattern.factory.static_factory;

public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);

        // 加配料
        coffee.addSugar();
        coffee.addMilk();

        return coffee;
    }
}
