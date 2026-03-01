package creational.factory.simple.example;

import creational.factory.simple.example.factory.ChicagoPizzaFactory;
import creational.factory.simple.example.pizza.Pizza;

public class Main {
    static void main() {
        ChicagoPizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();
        Pizza pizza = chicagoPizzaFactory.createPizza("cheese");
        pizza.orderPizza();
    }
}
