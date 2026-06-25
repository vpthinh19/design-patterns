package behavior.strategy.example;

public class Main {
    static void main() {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentMethod(new MomoPayment());
        cart.checkout(300000);
        cart.setPaymentMethod(new CODPayment());
        cart.checkout(100000);
    }
}
