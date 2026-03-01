package creational.factory.simple.example.pizza;

public class VeggiePizza implements Pizza {
    @Override
    public void orderPizza() {
        System.out.println("VeggiePizza");
    }
}
