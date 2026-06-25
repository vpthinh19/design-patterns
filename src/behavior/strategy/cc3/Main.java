package behavior.strategy.cc3;

public class Main {
    static void main() {
        GioHang gioHang = new GioHang();
        gioHang.themMatHang(new MatHang("A", 5, 200000));
        gioHang.themMatHang(new MatHang("A", 10, 300000));
        gioHang.themMatHang(new MatHang("A", 15, 1000000));
        gioHang.setHinhThucThanhToan(new ThanhToanAirpay());
        gioHang.setHinhThucKhuyenMai(new KhuyenMaiPhanTram(0.05, 1000000));
        gioHang.thanhToan();
    }
}
