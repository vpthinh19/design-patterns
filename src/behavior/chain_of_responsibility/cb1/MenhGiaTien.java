package behavior.chain_of_responsibility.cb1;

public class MenhGiaTien extends ATM{
    private ATM keTiep;

    public MenhGiaTien(int menhGia, String ten) {
        super(menhGia, ten);
    }

    @Override
    public ATM keTiep(ATM keTiep) {
        return this.keTiep = keTiep;
    }

    @Override
    public void rutTien(int soTien) {
        if (soTien > 0){
            int soTo = soTien / this.menhGia;
            int tienDu = soTien % this.menhGia;
            if (soTo > 0){
                System.out.println("Menh gia \"" + this.ten + "\" (" + this.menhGia + "): " + soTo + " to");
            }
            if (tienDu > 0 && this.keTiep != null){
                keTiep.rutTien(tienDu);
            }
        }
    }
}
