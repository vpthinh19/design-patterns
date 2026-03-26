package behavior.observer.ca5;

public class Main {
    static void main() {
        TaiKhoan tk1 = new TaiKhoan("A", 1000);
        TaiKhoan tk2 = new TaiKhoan("B", 3000);
        TaiKhoan tk3 = null;
        ATM atm = new ATM();
        atm.nhanThe(tk3);
        atm.rutTien(1000);
        atm.traThe();
    }
}
