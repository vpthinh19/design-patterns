package behavior.observer.ca3;

public class Main {
    static void main() {
        DichVuTiGia dichVu = new DichVuTiGia();
        NhaDauTu ndtA = new NhaDauTu("A", dichVu);
        NhaDauTu ndtB = new NhaDauTu("B", dichVu);
        dichVu.capNhatTiGia(3.795);
        dichVu.capNhatTiGia(3.7);
    }
}
