package gk.bai1;

public class BorderDecorator extends Decorator {
    public BorderDecorator(IAnh decorator) {
        super(decorator);
    }

    @Override
    public String hienThi() {
        return super.hienThi() + " + đóng khung";
    }
}
