package coffee;

public class SugarDecorator extends Decorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public Double cost() {
        return coffee.cost() + 1.0;
    }
}
