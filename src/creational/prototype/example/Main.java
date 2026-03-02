package creational.prototype.example;

public class Main {
    static void main() {
        Circle c1 = new Circle(10.0);
        System.out.println(c1);
        Circle c2 = (Circle) c1.clone();
        System.out.println(c2);
    }
}
