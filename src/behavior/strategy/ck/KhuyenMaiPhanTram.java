package behavior.strategy.ck;

public class KhuyenMaiPhanTram implements PhuongThucKhuyenMai{
    private double phanTramGiam;
    private double tienGiamToiDa;

    public KhuyenMaiPhanTram(double phanTramGiam, double tienGiamToiDa) {
        this.phanTramGiam = phanTramGiam;
        this.tienGiamToiDa = tienGiamToiDa;
    }

    @Override
    public double khuyenMai(double tongTien) {
        double tienGiam = 0;
        if (tongTien > 0) tienGiam = Math.min(tongTien * phanTramGiam, tienGiamToiDa);
        return tienGiam;
    }
}
