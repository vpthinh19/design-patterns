package behavior.strategy.ck;

public class ThanhToanAirpay implements PhuongThucThanhToan{
    public ThanhToanAirpay() {
    }

    @Override
    public void thanhToan(double tongTien) {
        double tienGiam = 0;
        if (tongTien > 0){
            if (tongTien >= 1000000) tienGiam = tongTien * 0.03;
        }
        double tienCanThanhToan = tongTien - tienGiam;
        System.out.println("Tien Airpay giam thanh toan: " + tienGiam);
        System.out.println("Tien can thanh toan: " + tienCanThanhToan);
    }
}
