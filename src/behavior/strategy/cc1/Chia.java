package behavior.strategy.cc1;

public class Chia implements Tinh{
    @Override
    public float tinh(float a, float b) {
        if (b == 0) throw new IllegalArgumentException("Khong the chia cho 0");
        return a / b;
    }
}
