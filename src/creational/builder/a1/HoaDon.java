package creational.builder.a1;
import java.time.LocalDate;

import javax.security.auth.kerberos.KerberosTicket;
import java.util.ArrayList;

public class HoaDon {
    HoaDonHeader hoaDonHeader;
    ArrayList<CTHD> cTHDs;

    public HoaDon(HoaDonHeader hoaDonHeader, ArrayList<CTHD> cTHDs) {
        this.cTHDs = cTHDs;
        this.hoaDonHeader = hoaDonHeader;
    }
    public String toString(){
        String res = "-".repeat(100) + "\n" + hoaDonHeader.toString() + "\n";
        for (var cTHD:cTHDs){
            res += cTHD.toString() + "\n";
        }
        res += "-".repeat(100);
        return res;
    }

    public static class Builder{
        private HoaDonHeader hoaDonHeader;
        private ArrayList<CTHD> cTHDs = new ArrayList<CTHD>();
        public Builder setHeader(String maHoaDon, LocalDate ngayBan, String tenKhachHang){
            hoaDonHeader  = new HoaDonHeader(maHoaDon, ngayBan, tenKhachHang);
            return this;
        }
        public Builder setCTHD(String sanPham, Integer soLuong, Double donGia, Double chietKhau){
            cTHDs.add(new CTHD(sanPham, soLuong, donGia, chietKhau));
            return this;
        }
        public HoaDon build(){
            return new HoaDon(hoaDonHeader, cTHDs);
        }
    }
}
