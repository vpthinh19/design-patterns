package gk.bai2;

public class MonAn extends MenuItem{
    private double gia;

    public MonAn(String ten, double gia) {
        super(ten);
        this.gia = gia;
    }

    @Override
    public void add(MenuItem item) {

    }

    @Override
    public void remove(MenuItem item) {

    }

    @Override
    public void hienThi(String prefix) {
        System.out.println(prefix + ten + ": " + gia);
    }

    @Override
    public double tinhGia() {
        return this.gia;
    }
}
