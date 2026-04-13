package behavior.chain_of_responsibility.cb1;

public class MenhGiaThapNhat extends ATM{
    public MenhGiaThapNhat(int menhGia, String ten) {
        super(menhGia, ten);
    }

    @Override
    public ATM keTiep(ATM keTiep) {
        return null;
    }

    @Override
    public void rutTien(int soTien) {
        int soTo = soTien / this.menhGia;
        if (soTo > 0){
            System.out.println("Menh gia \"" + this.ten + "\" (" + this.menhGia + "): " + soTo + " to");
        }
    }
}
