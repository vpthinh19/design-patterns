package behavior.strategy.cc2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QLSV {
    private List<SinhVien> danhSachSinhVien = new ArrayList<>();
    private ISoSanh<SinhVien> soSanh;

    public QLSV() {
    }

    public void themSinhVien(SinhVien sinhVien){
        this.danhSachSinhVien.add(sinhVien);
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh){
        this.soSanh = soSanh;
    }

    public void sapXep(){
        if (this.soSanh == null) {
            System.out.println("Chon phuong thuc so sanh");
            return;
        }
        danhSachSinhVien.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return soSanh.soSanh(o1, o2);
            }
        });
    }

    public void inDS(){
        System.out.println("Danh sach sv:");
        for (SinhVien sv: danhSachSinhVien){
            System.out.println(sv);
        }
    }
}
