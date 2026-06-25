package behavior.strategy.ck;

public class Main {
    static void main() {
        GioHang gioHang = new GioHang();
        gioHang.themMatHang(new MatHang("A", 5, 20000));
        gioHang.setThanhToan(new ThanhToanCOD());

    }
}
