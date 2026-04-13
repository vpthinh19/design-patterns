package behavior.chain_of_responsibility.cb1;

public class ATMChuoiVND extends ATMChuoi {
    private ATM menhGia500 = new MenhGiaTien(500, "Nam tram nghin dong");
    private ATM menhGia100 = new MenhGiaTien(100, "Mot tram nghin dong");
    private ATM menhGia50 = new MenhGiaTien(50, "Nam muoi nghin dong");
    private ATM menhGia10 = new MenhGiaTien(10, "Muoi nghin dong");
    private ATM menhGia1 = new MenhGiaThapNhat(1, "Mot nghin dong");

    public ATMChuoiVND() {
        super();
        menhGia500.keTiep(menhGia100);
        menhGia100.keTiep(menhGia50);
        menhGia50.keTiep(menhGia10);
        menhGia10.keTiep(menhGia1);
    }

    @Override
    public ATM getChuoiMenhGia(int mg) {
        if (mg<=0) return null;
        switch (mg){
            case 500: return menhGia500;
            case 100: return menhGia100;
            case 50: return menhGia50;
            case 10: return menhGia10;
            case 1: return menhGia1;
            default: return null;
        }
    }
}
