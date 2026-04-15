package gk.bai1;

public class WatermarkDecorator extends Decorator {
    public WatermarkDecorator(IAnh decorator) {
        super(decorator);
    }

    @Override
    public String hienThi() {
        return super.hienThi() + " + watermark";
    }
}
