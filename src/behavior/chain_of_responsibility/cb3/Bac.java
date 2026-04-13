package behavior.chain_of_responsibility.cb3;

public class Bac extends IBac{
    private IBac bacKeTiep;
    public Bac(int min, int max, int gia, String ten) {
        super(min, max, gia, ten);
    }

    @Override
    public int tinhTienDien(int soKWh) {
        if (soKWh > 0){
            int giaTien;
            if (soKWh <= this.max){
                giaTien = (soKWh - this.min) * this.gia;
                System.out.println(this.ten + ":  " + this.min + " -> " + this.max + " (" + (soKWh - this.min) + "*" + this.gia + "): "  + giaTien);
                return giaTien;
            }
            else {
                giaTien = (this.max - this.min) * this.gia;
                System.out.println(this.ten + ":  " + this.min + " -> " + this.max + " (" + (this.max - this.min) + "*" + this.gia + "): "  + giaTien);
                return giaTien + this.bacKeTiep.tinhTienDien(soKWh);

            }
        }
        return 0;
    }

    @Override
    public IBac keTiep(IBac bacKeTiep) {
        return this.bacKeTiep = bacKeTiep;
    }
}
