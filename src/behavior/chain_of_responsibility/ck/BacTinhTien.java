package behavior.chain_of_responsibility.ck;

public abstract class BacTinhTien {
    protected double minSoKhoi;
    protected double maxSoKhoi;
    protected double donGia;

    public BacTinhTien(double minSoKhoi, double maxSoKhoi, double donGia) {
        this.minSoKhoi = minSoKhoi;
        this.maxSoKhoi = maxSoKhoi;
        this.donGia = donGia;
    }

    public abstract double tinhTien(double tongSoKhoi, HoaDon hoaDon);
    public abstract void setBacTiepTheo(BacTinhTien hanlder);
}
