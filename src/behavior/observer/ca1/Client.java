package behavior.observer.ca1;

import java.util.List;

public class Client implements Listener<List<MonHoc>>{
    private Stream<List<MonHoc>> stream;

    public Client(Stream<List<MonHoc>> stream) {
        this.stream = stream;
        stream.addListener(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        for (var monHoc: monHocs){
            System.out.println(monHoc);
        }
    }
}
