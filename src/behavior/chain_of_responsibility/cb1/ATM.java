package behavior.chain_of_responsibility.cb1;

public abstract class ATM {
    protected int menhGia;
    protected String ten;

    public ATM(int menhGia, String ten) {
        this.menhGia = menhGia;
        this.ten = ten;
    }

    public abstract ATM keTiep(ATM keTiep);

    public abstract void rutTien(int soTien);
}