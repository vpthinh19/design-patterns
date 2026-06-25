package behavior.strategy.cc3;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    private IThanhToan hinhThucThanhToan;
    private IKhuyenMai hinhThucKhuyenMai;
    private List<MatHang> dsMatHang = new ArrayList<>();

    public GioHang() {
    }
    public void themMatHang(MatHang matHang){
        dsMatHang.add(matHang);
    }

    public void setHinhThucThanhToan(IThanhToan hinhThucThanhToan){
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public void setHinhThucKhuyenMai(IKhuyenMai hinhThucKhuyenMai){
        this.hinhThucKhuyenMai = hinhThucKhuyenMai;
    }

    public double tinhTongTienHang(){
        double tong = 0;
        for (MatHang mh:dsMatHang){
            tong += mh.getThanhTien();
        }
        return tong;
    }

    public void thanhToan(){
        double tongTienHang = tinhTongTienHang();
        for (MatHang mh:dsMatHang){
            System.out.println(mh);
        }
        System.out.println("-".repeat(100));
        System.out.printf("Tong tien hang: %,.0f VND\n", tongTienHang);
        double tienGiamThanhToan = 0;
        if (hinhThucThanhToan != null){
            tienGiamThanhToan = hinhThucThanhToan.tinhTienGiam(tongTienHang);
        }
        System.out.printf("Giam gia thanh toan: -%,.0f VND\n", tienGiamThanhToan);

        double tienGiamKhuyenMai = 0;
        if (hinhThucKhuyenMai != null){
            tienGiamKhuyenMai = hinhThucKhuyenMai.tinhTienKhuyenMai(tongTienHang);
        }
        System.out.printf("Giam gia khuyen mai: -%,.0f VND\n", tienGiamKhuyenMai);
        double tienCanThanhToan = tongTienHang - tienGiamThanhToan - tienGiamKhuyenMai;
        tienCanThanhToan = Math.max(tienCanThanhToan, 0);
        System.out.println("-".repeat(100));
        System.out.printf("So tien can thanh toan: %,.0f VND\n", tienCanThanhToan);
        System.out.println("-".repeat(100));
    }
}
