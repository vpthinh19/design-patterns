package behavior.chain_of_responsibility.cb3;

public class Main {
    static void main() {
        IBac bac1 = new Bac(0, 50, 1806, "Bac 1");
        IBac bac2 = new Bac(50, 100, 1866, "Bac 2");
        IBac bac3 = new Bac(100, 200, 2167, "Bac 3");
        IBac bac4 = new Bac(200, 300, 2729, "Bac 4");
        IBac bac5 = new Bac(300, 400, 3050, "Bac 5");
        IBac bac6 = new BacCaoNhat(400, 3151, "Bac 6");
        bac1.keTiep(bac2);
        bac2.keTiep(bac3);
        bac3.keTiep(bac4);
        bac4.keTiep(bac5);
        bac5.keTiep(bac6);

        int tong = bac1.tinhTienDien(450);
        System.out.println("Tong tien dien: " + tong);
    }
}
