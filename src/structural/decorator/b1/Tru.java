package structural.decorator.b1;

public class Tru extends Decorator{
    private Double toanHang;
    public Tru(BieuThuc bieuThuc, Double toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + bieuThuc.bieuThuc() + "-" + this.toanHang + ")";
    }

    @Override
    public Double giaTri() {
        return bieuThuc.giaTri() - this.toanHang;
    }
}
