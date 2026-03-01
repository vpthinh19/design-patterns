package creational.builder.a1;

public class CTHD {
    private String sanPham;
    private Integer soLuong;
    private Double donGia;
    private Double chietKhau;

    public CTHD(String sanPham, Integer soLuong, Double donGia, Double chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return sanPham + " | " + soLuong + " | " + donGia + " | " + chietKhau;
    }
}
