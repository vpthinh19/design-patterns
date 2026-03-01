package creational.factory.method.example.pizzastore;

import creational.factory.method.example.pizza.ChicagoStyleCheesePizza;
import creational.factory.method.example.pizza.Pizza;

public class ChicagoStyleCheesePizzaStore implements PizzaStore {
    @Override
    public Pizza createPizza() {
        return new ChicagoStyleCheesePizza();
    }
}
