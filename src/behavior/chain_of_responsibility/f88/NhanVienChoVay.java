package behavior.chain_of_responsibility.f88;

public class NhanVienChoVay extends NhanVienDuyetVay{
    private NhanVienDuyetVay capTren;
    public NhanVienChoVay(String ten, String chucVu, int hanMuc) {
        super(ten, chucVu, hanMuc);
    }

    @Override
    public NhanVienDuyetVay capTren(NhanVienDuyetVay capTren) {
        this.capTren = capTren;
        return this.capTren;
    }

    @Override
    public void duyetVay(int soTien) {
        if (soTien <= hanMuc){
            System.out.println("Da duyet. Nguoi duyet: ten: " + this.ten + " chuc vu: " + this.chucVu);
            System.out.println("Chuyen cho cap tren");
            if (capTren != null){
                capTren.duyetVay(soTien);
            }
        }
        else {
            System.out.println("Cty tu choi");
        }
    }
}
