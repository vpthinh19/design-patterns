package creational.builder.a5;

import java.util.ArrayList;

public class Sach {
    private String tuaDe;
    private Integer soTrang;
    private String tacGia;
    private ArrayList<String> danhSachChuong;
    private StringBuilder sb = new StringBuilder("");

    protected Sach(String tuaDe, Integer soTrang, String tacGia, ArrayList<String> danhSachChuong) {
        this.tuaDe = tuaDe;
        this.soTrang = soTrang;
        this.tacGia = tacGia;
        this.danhSachChuong = danhSachChuong;
    }

    @Override
    public String toString() {
        sb.append("-".repeat(100) + "\n");
        sb.append("Tua de: " + tuaDe + "\n");
        sb.append("So trang: " + soTrang + "\n");
        sb.append("Tac gia: " + tacGia + "\n");
        sb.append("***\n");
        for (int i=0; i<danhSachChuong.size(); i++){
            sb.append( i + ". " + danhSachChuong.get(i) + "\n");
        }
        sb.append("-".repeat(100));
        return sb.toString();
    }

    public static class Builder{
        private String tuaDe;
        private Integer soTrang;
        private String tacGia;
        private ArrayList<String> danhSachChuong = new ArrayList<String>();
        public Builder addTuaDe(String tuaDe){
            this.tuaDe = tuaDe;
            return this;
        }
        public Builder addSoTrang(Integer soTrang){
            this.soTrang = soTrang;
            return this;
        }
        public Builder addTacGia(String tacGia){
            this.tacGia = tacGia;
            return this;
        }
        public Builder addChuong(String chuong){
            this.danhSachChuong.add(chuong);
            return this;
        }
        public Sach build(){
            Sach sach = new Sach(tuaDe, soTrang, tacGia, danhSachChuong);
            return sach;
        }
    }
}
