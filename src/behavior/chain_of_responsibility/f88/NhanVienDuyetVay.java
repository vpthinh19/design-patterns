package behavior.chain_of_responsibility.f88;

public abstract class NhanVienDuyetVay {
    protected String ten, chucVu;
    protected int hanMuc;

    public NhanVienDuyetVay(String ten, String chucVu, int hanMuc) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMuc = hanMuc;
    }

    abstract public NhanVienDuyetVay capTren(NhanVienDuyetVay capTren);
    abstract public void duyetVay(int soTien);
}
