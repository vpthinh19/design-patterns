package coffee;

public class MilkDecorator extends Decorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public Double cost() {
        return coffee.cost() + 2.0;
    }
}
