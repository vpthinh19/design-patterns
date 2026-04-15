package gk.bai1;

public class FilterDecorator extends Decorator{
    public FilterDecorator(IAnh decorator) {
        super(decorator);
    }

    @Override
    public String hienThi() {
        return super.hienThi() + " + filter";
    }
}
