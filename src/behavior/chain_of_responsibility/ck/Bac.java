package behavior.chain_of_responsibility.ck;

public class Bac extends BacTinhTien{
    private BacTinhTien hanlder;
    public Bac(double minSoKhoi, double maxSoKhoi, double donGia) {
        super(minSoKhoi, maxSoKhoi, donGia);
    }

    @Override
    public double tinhTien(double tongSoKhoi, HoaDon hoaDon) {
        double giaTien;
        if (hanlder == null) return 0;
        if (minSoKhoi <= tongSoKhoi && tongSoKhoi <= maxSoKhoi) {
            giaTien = (tongSoKhoi - minSoKhoi) * donGia;
            hoaDon.getChiTietTungBac().add(String.valueOf(giaTien));
            return giaTien;
        } else {
            giaTien = (maxSoKhoi - minSoKhoi) * donGia;
            hoaDon.getChiTietTungBac().add(String.valueOf(giaTien));
            return giaTien + hanlder.tinhTien(tongSoKhoi, hoaDon);
        }
    }

    @Override
    public void setBacTiepTheo(BacTinhTien hanlder) {
        this.hanlder = hanlder;
    }
}
