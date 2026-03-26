package behavior.chain_of_responsibility.f88;

public class ChuTich extends NhanVienDuyetVay{
    public ChuTich(String ten, String chucVu, int hanMuc) {
        super(ten, chucVu, hanMuc);
    }

    @Override
    public NhanVienDuyetVay capTren(NhanVienDuyetVay capTren) {
        return this;
    }

    @Override
    public void duyetVay(int soTien) {
        if (soTien <= hanMuc){
            System.out.println("Da duyet. Nguoi duyet: ten: " + this.ten + " chuc vu: " + this.chucVu);
        }
        else {
            System.out.println("Cty tu choi");
        }
    }
}
