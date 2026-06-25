package behavior.strategy.example;

public class MomoPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan " + amount + " VND qua vi Momo thanh cong");
    }
}
