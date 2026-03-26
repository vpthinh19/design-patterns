package behavior.observer.ca5;

public interface ATMListener {
    boolean kiemTraSoDu(double soTien);
    void nhanThongBao(double soTien, boolean trangThai);
}
