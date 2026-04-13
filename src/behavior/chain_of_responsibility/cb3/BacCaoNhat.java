package behavior.chain_of_responsibility.cb3;

public class BacCaoNhat extends IBac {
    public BacCaoNhat(int min, int gia, String ten) {
        super(min, -1, gia, ten);
    }

    @Override
    public IBac keTiep(IBac bacKeTiep) {
        return null;
    }

    @Override
    public int tinhTienDien(int soKWh) {
        int giaTien = (soKWh - this.min) * this.gia;
        System.out.println(this.ten + ":  " + this.min + " -> inf (" + (soKWh - this.min) + "*" + this.gia + "): "  + giaTien);
        return giaTien;
    }
}
