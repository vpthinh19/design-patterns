package behavior.observer.ca1;

public class MonHoc {
    private String ten;
    private int soTC;

    public MonHoc(String ten, int soTC) {
        this.ten = ten;
        this.soTC = soTC;
    }

    public String getTen() {
        return ten;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "ten='" + ten + '\'' +
                ", soTC=" + soTC +
                '}';
    }
}
