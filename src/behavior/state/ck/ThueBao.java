package behavior.state.ck;

public class ThueBao {
    private double soDu;
    private State state;

    public ThueBao() {
        this.soDu = 0;
        this.state = new NormalState();
    }

    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(double soDu) {
        this.soDu = soDu;
    }

    public void setState(State state){
        this.state = state;
    }
    public void napTien(double soTien){
        state.napTien(this, soTien);
    }

    public void thucHienCuocGoi(int soGiay){
        state.thucHienCuocGoi(this, soGiay);
    }

    public void inThongTin(){
        state.inThongTin(this);
    }
}
