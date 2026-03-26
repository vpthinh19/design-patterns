package behavior.chain_of_responsibility.f88;

public class Main {
    static void main() {
        NhanVienChoVay nhanVienA = new NhanVienChoVay("A", "1", 20);
        NhanVienChoVay nhanVienB = new NhanVienChoVay("B", "2", 50);
        NhanVienChoVay nhanVienC = new NhanVienChoVay("C", "3", 100);
        NhanVienChoVay chuTich = new NhanVienChoVay("S", "Chu Tich", 1000);
        nhanVienA.capTren(nhanVienB);
        nhanVienB.capTren(nhanVienC);
        nhanVienC.capTren(chuTich);
        nhanVienA.duyetVay(20);
    }
}
