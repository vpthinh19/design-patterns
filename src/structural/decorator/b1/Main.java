package structural.decorator.b1;

public class Main {
    static void main() {
        BieuThuc bieuThuc = new BieuThucDonGian(1.0);
        Decorator cong = new Cong(bieuThuc, 2.0);
        Decorator nhan = new Nhan(cong, 3.0);
        System.out.println(nhan.bieuThuc());
    }
}
