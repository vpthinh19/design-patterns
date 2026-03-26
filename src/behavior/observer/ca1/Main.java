package behavior.observer.ca1;

import java.util.*;

public class Main {
    static void main() {
        Stream<List<MonHoc>> stream = new Stream<>();
        DataAccess da = new DataAccess(stream);
        Client client1 = new Client(stream);
        da.add(new MonHoc("A", 3));
        System.out.println();
        da.add(new MonHoc("B", 4));
    }
}
