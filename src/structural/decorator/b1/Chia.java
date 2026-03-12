package structural.decorator.b1;

public class Chia extends Decorator{
    private final Double toanHang;

    public Chia(BieuThuc bieuThuc, Double toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + bieuThuc.bieuThuc() + "/" + this.toanHang + ")";
    }

    @Override
    public Double giaTri() {
        return (this.toanHang != 0) ? (bieuThuc.giaTri() / this.toanHang) : (null);
    }
}
