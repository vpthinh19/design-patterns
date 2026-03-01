package creational.builder.a5;

public class Main {
    static void main() {
        Sach sach = new Sach.Builder()
                .addTuaDe("abcxyz")
                .addTacGia("Thinh")
                .addSoTrang(20)
                .addChuong("aaaaaaaaaaa")
                .addChuong("bbbbbbbbbbbbb")
                .addChuong("ccccccccccccccc")
                .build();
        System.out.println(sach);
    }
}
