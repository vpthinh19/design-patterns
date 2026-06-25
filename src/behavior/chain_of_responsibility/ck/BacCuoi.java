package behavior.chain_of_responsibility.ck;

public class BacCuoi extends BacTinhTien{
    public BacCuoi(double minSoKhoi, double maxSoKhoi, double donGia) {
        super(minSoKhoi, maxSoKhoi, donGia);
    }

    @Override
    public double tinhTien(double tongSoKhoi, HoaDon hoaDon) {
        double giaTien = (tongSoKhoi - minSoKhoi) * donGia;
        hoaDon.getChiTietTungBac().add(String.valueOf(giaTien));
        return giaTien;
    }

    @Override
    public void setBacTiepTheo(BacTinhTien hanlder) {

    }
}
