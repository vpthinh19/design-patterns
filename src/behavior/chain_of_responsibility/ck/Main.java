package behavior.chain_of_responsibility.ck;

public class Main {
    static void main() {
        HoaDon hoaDon = new HoaDon("1", "ABC", 20);
        BacTinhTien bac1 = new Bac(0, 10, 6000);
        BacTinhTien bac2 = new Bac(11, 20, 7500);
        BacTinhTien bac3 = new Bac(21, 30, 9000);
        BacTinhTien bac4 = new Bac(31, Double.MAX_VALUE, 12000);
        bac1.setBacTiepTheo(bac2);
        bac2.setBacTiepTheo(bac3);
        bac3.setBacTiepTheo(bac4);
        hoaDon.setTinhTien(bac1);
        System.out.println(hoaDon.tinhTien());
        hoaDon.inThongTin();
    }
}
