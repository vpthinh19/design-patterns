package behavior.observer.ca1;

import java.util.ArrayList;
import java.util.List;

public class Stream<T> {
    private List<Listener<T>> listeners = new ArrayList<>();
    public Stream() {
    }

    public void addListener(Listener<T> l){
        this.listeners.add(l);
    }
    public void removeListener(Listener<T> l){
        this.listeners.remove(l);
    }
    public void addEvent(T t){
        for (var listener: listeners){
            listener.listen(t);
        }
    }
}
