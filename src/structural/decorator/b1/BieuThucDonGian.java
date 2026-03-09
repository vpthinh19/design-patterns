package structural.decorator.b1;

public class BieuThucDonGian implements BieuThuc{
    protected Double toanHang;

    public BieuThucDonGian(Double toanHang) {
        this.toanHang = toanHang;
    }

    @Override
    public Double giaTri() {
        return toanHang;
    }

    @Override
    public String bieuThuc() {
        return toanHang.toString();
    }
}
