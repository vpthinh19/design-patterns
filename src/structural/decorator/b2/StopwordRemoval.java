package structural.decorator.b2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class StopwordRemoval extends Decorator{
    private ArrayList<String> mangChuoi;
    String[] mangStopWords = new String[]{"và", "hoặc", "thì", "mà", "là"};
    private ArrayList<String> stopWords = new ArrayList<>(Arrays.asList(mangStopWords));

    public StopwordRemoval(Chuoi chuoi) {
        super(chuoi);
    }

    @Override
    public ArrayList<String> print() {
        mangChuoi = chuoi.print();
        Iterator<String> it = mangChuoi.iterator();
        while (it.hasNext()){
            String s = it.next();
            if (stopWords.contains(s)){
                it.remove();
            }
        }
        return mangChuoi;
    }
}
