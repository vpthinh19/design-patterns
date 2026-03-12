package structural.decorator.b2;

import java.util.ArrayList;

public class PunctualRemoval extends Decorator{
    ArrayList<String> mangChuoi;
    public PunctualRemoval(Chuoi chuoi) {
        super(chuoi);
        mangChuoi = new ArrayList<>(chuoi.get());
        for (int i=0; i<mangChuoi.size(); i++){
            mangChuoi.set(i, mangChuoi.get(i).replaceAll("[^\\p{L}0-9]", ""));
        }
    }

    @Override
    public ArrayList<String> get() {
        return mangChuoi;
    }
}
