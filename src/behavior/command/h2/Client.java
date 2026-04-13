package behavior.command.h2;

public class Client {
    static void main() {
        CasioCalculator calculator = new CasioCalculator();
        calculator.compute('+', 10.0f);
        calculator.compute('*', 3.0f);
        calculator.compute('-', 2.5f);
        System.out.println(calculator.getHanler().getResult());
        calculator.undo();
        calculator.undo();
        System.out.println(calculator.getHanler().getResult());
        calculator.redo();
        System.out.println(calculator.getHanler().getResult());
    }
}
