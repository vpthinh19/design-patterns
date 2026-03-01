package creational.builder.a1;

import java.time.LocalDate;

public class Main {
    static void main() {
        HoaDon hoaDon1 = new HoaDon.Builder()
                .setHeader("1234", LocalDate.now(), "Thinh")
                .setCTHD("Oreo", 10, 15000.0, 0.0)
                .build();
        HoaDon hoaDon2 = new HoaDon.Builder()
                .setHeader("1234", LocalDate.now(), "Thinh")
                .setCTHD("Cocacola", 2, 12000.0, 0.0)
                .build();
        System.out.println(hoaDon1);
        System.out.println(hoaDon2);
    }
}
