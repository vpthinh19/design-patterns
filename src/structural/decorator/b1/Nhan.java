package structural.decorator.b1;

public class Nhan extends Decorator{
    private final Double toanHang;
    public Nhan(BieuThuc bieuThuc, Double toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + bieuThuc.bieuThuc() + "*" + this.toanHang + ")";
    }

    @Override
    public Double giaTri() {
        return bieuThuc.giaTri() * this.toanHang;
    }
}
