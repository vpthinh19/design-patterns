package behavior.chain_of_responsibility.cb3;

public abstract class IBac {
    protected int min, max, gia;
    protected String ten;

    public IBac(int min, int max, int gia, String ten) {
        this.min = min;
        this.max = max;
        this.gia = gia;
        this.ten = ten;
    }
    public abstract IBac keTiep(IBac bacKeTiep);
    public abstract int tinhTienDien(int soKWh);
}
