package structural.decorator.b1;

public class Main {
    static void main() {
        BieuThuc bieuThuc = new BieuThucDonGian(6.0);
        Decorator cong = new Cong(bieuThuc, 9.0);
        Decorator nhan = new Nhan(cong, 8.0);
        Decorator chia = new Chia(nhan, 0.0);
        System.out.println(chia.bieuThuc());
    }
}
