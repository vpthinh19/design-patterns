package behavior.state.ck;

public class NormalState implements State{
    private double cuocGoiTrenPhut = 1800;

    public NormalState() {
    }

    @Override
    public void napTien(ThueBao tb, double soTien) {
        tb.setSoDu(tb.getSoDu() + soTien);
        if (100000 < tb.getSoDu() && tb.getSoDu() <= 200000){
            tb.setState(new SilverState());
        } else if (200000 < tb.getSoDu()) {
            tb.setState(new GoldState());
        }
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
        }
    }

    @Override
    public void inThongTin(ThueBao tb) {
        System.out.println("Trang thai THUONG, cuoc phi " + cuocGoiTrenPhut + "VND/phut, so du: " + tb.getSoDu() + " thoi gian goi con lai: " + tb.getSoDu()/cuocGoiTrenPhut + " phut");
    }
}
