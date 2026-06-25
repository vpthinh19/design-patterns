package behavior.strategy.cc3;

public class KhuyenMaiPhanTram implements IKhuyenMai{
    private double phanTramGiam;
    private double tienGiamToiDa;

    public KhuyenMaiPhanTram(double phanTramGiam, double tienGiamToiDa) {
        this.phanTramGiam = phanTramGiam;
        this.tienGiamToiDa = tienGiamToiDa;
    }

    @Override
    public double tinhTienKhuyenMai(double tongTienHang) {
        double tienGiamTheoPhanTram = tongTienHang * phanTramGiam;
        return Math.min(tienGiamTheoPhanTram, tienGiamToiDa);
    }
}
