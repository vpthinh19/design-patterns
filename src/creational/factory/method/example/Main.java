package creational.factory.method.example;

import creational.factory.method.example.pizza.Pizza;
import creational.factory.method.example.pizzastore.ChicagoStyleCheesePizzaStore;
import creational.factory.method.example.pizzastore.NYStyleCheesePizzaStore;
import creational.factory.method.example.pizzastore.PizzaStore;

public class Main {
    static void main() {
        PizzaStore chicagoStyleCheesePizzaStore = new ChicagoStyleCheesePizzaStore();
        Pizza pizza1 = chicagoStyleCheesePizzaStore.createPizza();
        pizza1.orderPizza();

        PizzaStore nYStyleCheesePizzaStore = new NYStyleCheesePizzaStore();
        Pizza pizza2 = nYStyleCheesePizzaStore.createPizza();
        pizza2.orderPizza();
    }
}
