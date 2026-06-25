package behavior.state.ck;

public class Main {
    static void main() {
        ThueBao sim1 = new ThueBao();
        sim1.inThongTin();
        sim1.napTien(90000);
        sim1.inThongTin();
        sim1.thucHienCuocGoi(60);
        sim1.inThongTin();
        sim1.napTien(20000);
        sim1.inThongTin();
        sim1.thucHienCuocGoi(120);
        sim1.inThongTin();
        sim1.napTien(100000);
        sim1.inThongTin();
        sim1.thucHienCuocGoi(170 * 60);
        sim1.inThongTin();
    }
}
