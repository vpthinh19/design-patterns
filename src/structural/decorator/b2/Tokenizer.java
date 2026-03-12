package structural.decorator.b2;

import java.util.ArrayList;
import java.util.Arrays;

public class Tokenizer extends Decorator{
    private ArrayList<String> mangChuoi;
    public Tokenizer(Chuoi chuoi) {
        super(chuoi);
        mangChuoi = new ArrayList<>(Arrays.asList(chuoi.get().getFirst().split(" ")));
    }

    @Override
    public ArrayList<String> get() {
        return mangChuoi;
    }
}
