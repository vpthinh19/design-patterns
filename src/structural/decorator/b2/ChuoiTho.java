package structural.decorator.b2;

import java.util.ArrayList;

public class ChuoiTho implements Chuoi{
    private String chuoi;
    private ArrayList<String> mangChuoi;
    public ChuoiTho(String chuoi) {
        this.chuoi = chuoi;
    }

    @Override
    public ArrayList<String> print() {
        mangChuoi = new ArrayList<String>();
        mangChuoi.add(chuoi);
        return mangChuoi;
    }
}
