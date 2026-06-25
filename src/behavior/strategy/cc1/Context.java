package behavior.strategy.cc1;

public class Context {
    private Tinh tinhToan;

    public Context() {
    }

    public void setTinhToan(Tinh tinhToan){
        this.tinhToan = tinhToan;
    }

    public float tinh(float a, float b){
        return this.tinhToan.tinh(a, b);
    }
}
