package creational.prototype.example;

public class Circle implements Cloneable{
    private Double r;

    public Circle(Double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle";
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }
}
