package structural.decorator.b2;

import java.util.ArrayList;
import java.util.Arrays;

public class Tokenizer extends Decorator{
    private ArrayList<String> mangChuoi;
    public Tokenizer(Chuoi chuoi) {
        super(chuoi);
    }

    @Override
    public ArrayList<String> print() {
        String[] mangChuoiTinh = chuoi.print().removeFirst().split("[,# :.]");
        mangChuoi = new ArrayList<String>(Arrays.asList(mangChuoiTinh));
        mangChuoiTinh = null;
        return mangChuoi;
    }
}
