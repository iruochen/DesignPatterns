package com.ruochen.pattern.factory.config_factory;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("american");
        System.out.println(coffee.getName());
        System.out.println("====================");
        coffee = CoffeeFactory.createCoffee("latte");
        System.out.println(coffee.getName());
    }
}
