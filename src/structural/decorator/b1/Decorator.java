package structural.decorator.b1;

public abstract class Decorator implements BieuThuc {
    protected BieuThuc bieuThuc;

    public Decorator(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }
}
