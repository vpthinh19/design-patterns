package behavior.chain_of_responsibility.ck;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private String maKH;
    private String tenKH;
    private double tongSoTien;
    private double tongSoKhoi;
    private List<String> chiTietTungBac = new ArrayList<>();
    private BacTinhTien hanlder;

    public HoaDon(String maKH, String tenKH, double tongSoKhoi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.tongSoKhoi = tongSoKhoi;
    }

    public void setTinhTien(BacTinhTien hanlder){
        this.hanlder = hanlder;
    }

    public double tinhTien(){
        double tongSoTien =  hanlder.tinhTien(this.tongSoKhoi, this);
        this.tongSoTien = tongSoTien;
        return tongSoTien;
    }

    public void inThongTin(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maKH='" + maKH + '\'' +
                ", tenKH='" + tenKH + '\'' +
                ", tongSoTien=" + tongSoTien +
                ", tongSoKhoi=" + tongSoKhoi +
                ", chiTietTungBac=" + chiTietTungBac +
                '}';
    }

    public List<String> getChiTietTungBac() {
        return chiTietTungBac;
    }

    public void setChiTietTungBac(List<String> chiTietTungBac) {
        this.chiTietTungBac = chiTietTungBac;
    }

    public double getTongSoKhoi() {
        return tongSoKhoi;
    }

    public void setTongSoKhoi(double tongSoKhoi) {
        this.tongSoKhoi = tongSoKhoi;
    }

    public double getTongSoTien() {
        return tongSoTien;
    }

    public void setTongSoTien(double tongSoTien) {
        this.tongSoTien = tongSoTien;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }
}
