package gk.bai2;

public class Main {
    static void main() {
        MenuItem mon1 = new MonAn("Mon 1", 50000.0);
        MenuItem mon2 = new MonAn("Mon 2", 100000.0);
        MenuItem mon3 = new MonAn("Mon 3", 80000.0);
        MenuItem mon4 = new MonAn("Mon 4", 60000.0);
        MenuItem combo1 = new Combo("Combo 1");
        MenuItem combo2 = new Combo("Combo 2");
        combo1.add(mon1);
        combo1.add(mon4);
        combo1.add(combo2);
        combo2.add(mon3);
        combo2.add(mon2);
        combo1.hienThi("");
        System.out.println("Gia mon 3: " + mon3.tinhGia());
        System.out.println("Gia combo 2: " + combo2.tinhGia());
        System.out.println("Gia combo 1: " + combo1.tinhGia());
    }
}
