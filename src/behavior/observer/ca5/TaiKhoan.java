package behavior.observer.ca5;

public class TaiKhoan implements ATMListener {
    private String tenTaiKhoan;
    private double soDu = 0;
    private ATM atm;

    public TaiKhoan(String tenTaiKhoan, double soDu) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.soDu = soDu;
    }

    @Override
    public boolean kiemTraSoDu(double soTien) {
        return (soDu - soTien >= 50);
    }

    @Override
    public void nhanThongBao(double soTien, boolean trangThai) {
        if (trangThai){
            soDu -= soTien;
            System.out.println("Tai khoan \"" + tenTaiKhoan + "\" rut " + soTien + " thanh cong, so du: " + soDu);
        }
        else {
            System.out.println("Tai khoan \"" + tenTaiKhoan + "\" rut " + soTien + " that bai, so du: " + soDu);
        }
    }

    public void duaThe(ATM atm){
        this.atm = atm;
        atm.nhanThe(this);
    }

    public void rutThe(){
        atm.traThe();
        this.atm = null;
    }
}
