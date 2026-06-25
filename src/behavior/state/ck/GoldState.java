package behavior.state.ck;

public class GoldState implements State{
    private double cuocGoiTrenPhut = 1200;

    public GoldState() {
    }

    @Override
    public void napTien(ThueBao tb, double soTien) {
        tb.setSoDu(tb.getSoDu() + soTien);
    }

    @Override
    public void thucHienCuocGoi(ThueBao tb, int soGiay) {
        double soTien = soGiay * 1.0 / 60 * cuocGoiTrenPhut;
        if (soTien > tb.getSoDu()){
            System.out.println("Error");
            return;
        }
        else {
            tb.setSoDu(tb.getSoDu() - soTien);
            if (tb.getSoDu() <= 100000){
                tb.setState(new NormalState());
            } else if (100000 < tb.getSoDu() && tb.getSoDu() <= 200000) {
                tb.setState(new SilverState());
            }
        }
    }

    @Override
    public void inThongTin(ThueBao tb) {
        System.out.println("Trang thai VANG, cuoc phi " + cuocGoiTrenPhut + "VND/phut, so du: " + tb.getSoDu() + " thoi gian goi con lai: " + tb.getSoDu()/cuocGoiTrenPhut + " phut");
    }
}
