package behavior.strategy.cc2;

import java.time.LocalDate;

public class Main {
    static void main() {
        QLSV qlsv = new QLSV();
        qlsv.themSinhVien(new SinhVien("Nguyen Van B", LocalDate.of(2000, 1, 1), 7.5f));
        qlsv.themSinhVien(new SinhVien("Le Thi A", LocalDate.of(2000, 2, 10), 9.5f));
        qlsv.themSinhVien(new SinhVien("Tran Van C", LocalDate.of(2000, 9, 1), 5.5f));

        qlsv.setSoSanh(new SoSanhTheoTen());
        qlsv.sapXep();
        qlsv.inDS();

        System.out.println("\n");
        qlsv.setSoSanh(new SoSanhTheoDiem());
        qlsv.sapXep();
        qlsv.inDS();
    }
}
