package behavior.strategy.cc3;

public class MatHang {
    private String ten;
    private int soLuong;
    private double donGia;

    public MatHang(String ten, int soLuong, double donGia) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getThanhTien(){
        return soLuong * donGia;
    }

    @Override
    public String toString() {
        return String.format("- %s: %d x %,.0f = %,.0f VND", ten, soLuong, donGia, getThanhTien());
    }
}
