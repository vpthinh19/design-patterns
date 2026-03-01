package creational.builder.a1;
import java.time.LocalDate;

public class HoaDonHeader {
    private String maHoaDon;
    private LocalDate ngayBan;
    private String tenKhachHang;

    public HoaDonHeader(String maHoaDon, LocalDate ngayBan, String tenKhachHang) {
        this.maHoaDon = maHoaDon;
        this.ngayBan = ngayBan;
        this.tenKhachHang = tenKhachHang;
    }

    public String toString(){
        return "* " + maHoaDon + " | " + ngayBan + " | " + tenKhachHang;
    }
}
