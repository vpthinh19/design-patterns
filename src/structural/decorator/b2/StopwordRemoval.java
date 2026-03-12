package structural.decorator.b2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class StopwordRemoval extends Decorator{
    private ArrayList<String> mangChuoi;

    public StopwordRemoval(Chuoi chuoi) {
        super(chuoi);
        ArrayList<String> mangTuDung = new ArrayList<>(Arrays.asList("và", "hoặc", "thì", "mà", "là"));
        mangChuoi = new ArrayList<>(chuoi.get());
        Iterator<String> it = mangChuoi.iterator();
        while (it.hasNext()){
            String s = it.next();
            if (mangTuDung.contains(s)){
                it.remove();
            }
        }
    }

    @Override
    public ArrayList<String> get() {
        return mangChuoi;
    }
}
