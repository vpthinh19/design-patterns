package structural.decorator.b2;

import java.util.ArrayList;

public class ChuoiTho implements Chuoi{
    private String chuoi;
    private ArrayList<String> mangChuoi = new ArrayList<>();
    public ChuoiTho(String chuoi) {
        this.chuoi = chuoi;
        mangChuoi.add(chuoi);
    }

    @Override
    public ArrayList<String> get() {
        return mangChuoi;
    }
}
