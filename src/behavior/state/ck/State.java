package behavior.state.ck;

public interface State {
    void napTien(ThueBao tb, double soTien);
    void thucHienCuocGoi(ThueBao tb, int soGiay);
    void inThongTin(ThueBao tb);
}
