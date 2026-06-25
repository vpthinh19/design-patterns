package behavior.strategy.ck;

public class ThanhToanCOD implements PhuongThucThanhToan{
    public ThanhToanCOD() {
    }

    @Override
    public void thanhToan(double tongTien) {
        double tienGiam = 0;
        if (tongTien > 0){
            if (tongTien >= 2000000) tienGiam = tongTien * 0.02;
        }
        double tienCanThanhToan = tongTien - tienGiam;
        System.out.println("Tien COD giam thanh toan: " + tienGiam);
        System.out.println("Tien can thanh toan: " + tienCanThanhToan);
    }
}
