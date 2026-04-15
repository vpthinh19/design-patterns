package gk.bai1;

public class Decorator implements IAnh{
    private IAnh decorator;

    public Decorator(IAnh decorator) {
        this.decorator = decorator;
    }

    @Override
    public String hienThi() {
        return decorator.hienThi();
    }
}
