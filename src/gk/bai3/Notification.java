package gk.bai3;

public class Notification {
    private String tieuDe;
    private String noiDung;
    private String bieuTuong;
    private String amThanh;
    private String nutHanhDong;

    public Notification(Builder builder) {
        this.tieuDe = builder.tieuDe;
        this.noiDung = builder.noiDung;
        this.bieuTuong = builder.bieuTuong;
        this.amThanh = builder.amThanh;
        this.nutHanhDong = builder.nutHanhDong;
    }

    public static class Builder{
        private String tieuDe;
        private String noiDung;
        private String bieuTuong;
        private String amThanh;
        private String nutHanhDong;

        public Builder() {
        }
        public Builder addTieuDe(String tieuDe){
            this.tieuDe = tieuDe;
            return this;
        }
        public Builder addNoiDung(String noiDung){
            this.noiDung = noiDung;
            return this;
        }
        public Builder addBieuTuong(String bieuTuong){
            this.bieuTuong = bieuTuong;
            return this;
        }
    }
}
