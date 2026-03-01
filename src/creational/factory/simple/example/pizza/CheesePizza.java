package creational.factory.simple.example.pizza;

public class CheesePizza implements Pizza {
    @Override
    public void orderPizza() {
        System.out.println("CheesePizza");
    }
}
