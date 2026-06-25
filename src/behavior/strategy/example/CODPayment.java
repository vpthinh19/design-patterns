package behavior.strategy.example;

public class CODPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan " + amount + " VND qua COD thanh cong");
    }
}
