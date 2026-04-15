package gk.bai1;

public class Main {
    static void main() {
        IAnh anh = new Anh("anh con cho");
        Decorator filterDecorator = new FilterDecorator(anh);
        Decorator borderDecorator = new BorderDecorator(filterDecorator);
        Decorator watermarkDecorator = new WatermarkDecorator(borderDecorator);
        System.out.println(watermarkDecorator.hienThi());
    }
}
