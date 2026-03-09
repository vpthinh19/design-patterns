package coffee;

class Main{
    static void main() {
        Coffee coffee = new BlackCoffee();
        Decorator sugarDecorator = new SugarDecorator(coffee);
        Decorator milkDecorator = new MilkDecorator(sugarDecorator);
        Decorator iceDecorator = new IceDecorator(milkDecorator);
        System.out.println(coffee.cost());
        System.out.println(sugarDecorator.cost());
        System.out.println(milkDecorator.cost());
        System.out.println(iceDecorator.cost());
    }
}