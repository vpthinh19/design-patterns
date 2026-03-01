package creational.factory.method.example.pizzastore;

import creational.factory.method.example.pizza.NYStyleCheesePizza;
import creational.factory.method.example.pizza.Pizza;

public class NYStyleCheesePizzaStore implements PizzaStore {
    @Override
    public Pizza createPizza() {
        return new NYStyleCheesePizza();
    }
}
