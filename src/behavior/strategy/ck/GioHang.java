package behavior.strategy.ck;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    private List<MatHang> danhSachMatHang = new ArrayList<>();
    private PhuongThucThanhToan thanhToan;
    private PhuongThucKhuyenMai khuyenMai;

    public GioHang() {
    }

    public void themMatHang(MatHang matHang){
        danhSachMatHang.add(matHang);
    }

    public void setThanhToan(PhuongThucThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }

    public void setKhuyenMai(PhuongThucKhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public double tinhTongTienGoc(){
        double tongTien = 0;
        for (var matHang: danhSachMatHang){
            tongTien += matHang.getTien();
        }
        return tongTien;
    }

    public void thanhToan(){
        if (danhSachMatHang == null){
            System.out.println("Gio hang trong");
            return;
        }
        if (thanhToan == null){
            System.out.println("Chua dat phuong thuc thanh toan");
            return;
        }
        double tongTienGoc = tinhTongTienGoc();
        System.out.println("Tong tien goc: " + tongTienGoc);

        double tienGiamKhuyenMai = 0;
        if (khuyenMai != null){
            tienGiamKhuyenMai = khuyenMai.khuyenMai(tongTienGoc);
        }
        System.out.println("Tien giam khuyen mai: " + tienGiamKhuyenMai);
        double tienSauKhuyenMai = tongTienGoc - tienGiamKhuyenMai;
        thanhToan.thanhToan(tienSauKhuyenMai);
    }
}
