package behavior.strategy.cc3;

public class ThanhToanCOD implements IThanhToan{
    @Override
    public double tinhTienGiam(double tongTienHang) {
        if (tongTienHang >= 2000000){
            return tongTienHang * 0.02;
        }
        return 0;
    }
}
