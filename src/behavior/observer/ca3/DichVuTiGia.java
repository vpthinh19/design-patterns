package behavior.observer.ca3;

import java.util.ArrayList;
import java.util.List;

public class DichVuTiGia {
    private List<NhaDauTuListener> nhaDauTus = new ArrayList<>();
    private double tiGia;

    public DichVuTiGia() {
    }
    public void attach(NhaDauTuListener ndt){
        this.nhaDauTus.add(ndt);
    }
    public void detach(NhaDauTuListener ndt){
        this.nhaDauTus.remove(ndt);
    }
    public void capNhatTiGia(double tiGia){
        this.tiGia = tiGia;
        for (var nhaDauTu: this.nhaDauTus){
            nhaDauTu.capNhat(this.tiGia);
        }
    }
}
