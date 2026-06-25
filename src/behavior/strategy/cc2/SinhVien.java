package behavior.strategy.cc2;

import java.time.LocalDate;

public class SinhVien {
    private String hoTen;
    private LocalDate ngaySinh;
    private float diemTB;

    public SinhVien(String hoTen, LocalDate ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", diemTB=" + diemTB +
                '}';
    }

    public String getHoTen() {
        return hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }
}
