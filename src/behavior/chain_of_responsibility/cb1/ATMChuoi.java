package behavior.chain_of_responsibility.cb1;

public abstract class ATMChuoi {
    public ATMChuoi() {
    }

    public abstract ATM getChuoiMenhGia(int mg);

    public void rutTien(int mg, int mgCaoNhat){
        ATM chuoi = this.getChuoiMenhGia(mgCaoNhat);
        chuoi.rutTien(mg);
    }
}
