package behavior.observer.ca5;

public class ATM {
    private ATMListener taiKhoan;

    public ATM() {
    }

    public void nhanThe(ATMListener taiKhoan){
        this.taiKhoan = taiKhoan;
    }

    public void traThe(){
        this.taiKhoan = null;
    }

    public void rutTien(double soTien){
        if (taiKhoan == null){
            System.out.println("The khong ton tai");
            return;
        }
        if (this.taiKhoan.kiemTraSoDu(soTien)) {
            System.out.println("Rut " + soTien + " thanh cong");
            taiKhoan.nhanThongBao(soTien, true);
        } else {
            System.out.println("Rut " + soTien + " thai bai");
            taiKhoan.nhanThongBao(soTien, false);
        }
    }
}
