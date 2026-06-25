package behavior.strategy.example;

public class ShoppingCart {
    private PaymentMethod paymentMethod;

    public ShoppingCart() {
    }

    public void setPaymentMethod(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount){
        this.paymentMethod.pay(amount);
    }
}
