package behavior.observer.ca3;

public class NhaDauTu implements NhaDauTuListener{
    private String ten;
    private DichVuTiGia dichVu;

    public NhaDauTu(String ten, DichVuTiGia dichVu) {
        this.ten = ten;
        this.dichVu = dichVu;
        this.dichVu.attach(this);
    }

    @Override
    public void capNhat(double tiGia) {
        System.out.println("Nha dau tu " + this.ten + " nhan duoc ti gia moi: "+tiGia);
    }
}
