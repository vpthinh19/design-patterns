package behavior.strategy.ck;

public class ThanhToanMastercard implements PhuongThucThanhToan{
    public ThanhToanMastercard() {
    }

    @Override
    public void thanhToan(double tongTien) {
        double tienGiam = 0;
        if (tongTien > 0){
            if (tongTien >= 3000000) tienGiam = Math.min(tongTien * 0.05, tongTien - 300000);
        }
        double tienCanThanhToan = tongTien - tienGiam;
        System.out.println("tongTien: " + tongTien + ", MasterCard giam: " + tienGiam + ", tien can thanh toan: " + tienCanThanhToan);
    }
}
