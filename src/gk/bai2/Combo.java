package gk.bai2;

import java.util.ArrayList;
import java.util.List;

public class Combo extends MenuItem{
    private List<MenuItem> items = new ArrayList<>();
    public Combo(String ten) {
        super(ten);
    }

    @Override
    public void add(MenuItem item) {
        items.add(item);
    }

    @Override
    public void remove(MenuItem item) {
        items.remove(item);
    }

    @Override
    public void hienThi(String prefix) {
        System.out.println(prefix + ten);
        for (var item: items){
            item.hienThi(prefix + "\t");
        }
    }

    @Override
    public double tinhGia() {
        double gia = 0;
        for (var item: items){
            gia += item.tinhGia();
        }
        return gia;
    }
}
