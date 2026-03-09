package coffee;

public class IceDecorator extends Decorator {
    public IceDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public Double cost() {
        return coffee.cost() + 3.0;
    }
}
