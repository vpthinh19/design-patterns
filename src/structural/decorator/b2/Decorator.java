package structural.decorator.b2;

public abstract class Decorator implements Chuoi{
    protected Chuoi chuoi;

    public Decorator(Chuoi chuoi) {
        this.chuoi = chuoi;
    }
}
