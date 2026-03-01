package creational.factory.simple.example.factory;

import creational.factory.simple.example.pizza.*;

public class ChicagoPizzaFactory{
    public Pizza createPizza(String pizzaName) {
        switch (pizzaName.toLowerCase().strip()){
            case "cheese":
                return new CheesePizza();
            case "clam":
                return new ClamPizza();
            case "pepperoni":
                return new PepperoniPizza();
            case "veggie":
                return new VeggiePizza();
            default:
                return null;
        }
    }
}
