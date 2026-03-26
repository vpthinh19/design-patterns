package behavior.observer.ca1;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private List<MonHoc> monHocs = new ArrayList<>();
    private Stream<List<MonHoc>> stream;

    public DataAccess(Stream<List<MonHoc>> stream) {
        this.stream = stream;
    }

    public void add(MonHoc m){
        monHocs.add(m);
        stream.addEvent(monHocs);
    }
    public void update(MonHoc m){
        for (int i=0; i<monHocs.size(); i++){
            if (monHocs.get(i) == m){
                monHocs.set(i, m);
            }
        }
    }
    public void delete(MonHoc m){
        monHocs.remove(m);
        stream.addEvent(monHocs);
    }
}
