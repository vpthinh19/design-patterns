package gk.bai3;

public class Notification {
    private String tieuDe;
    private String noiDung;
    private String bieuTuong;
    private String amThanh;
    private String nutHanhDong;
    private int doUuTien;

    private Notification(Builder builder) {
        this.tieuDe = builder.tieuDe;
        this.noiDung = builder.noiDung;
        this.bieuTuong = builder.bieuTuong;
        this.amThanh = builder.amThanh;
        this.nutHanhDong = builder.nutHanhDong;
        this.doUuTien = builder.doUuTien;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "tieuDe='" + tieuDe + '\'' +
                ", noiDung='" + noiDung + '\'' +
                ", bieuTuong='" + bieuTuong + '\'' +
                ", amThanh='" + amThanh + '\'' +
                ", nutHanhDong='" + nutHanhDong + '\'' +
                ", doUuTien=" + doUuTien +
                '}';
    }

    public static class Builder {
        private String tieuDe = "";
        private String noiDung = "";
        private String bieuTuong = "";
        private String amThanh = "";
        private String nutHanhDong = "";
        private int doUuTien = 0;

        public Builder() {
        }

        public Builder withTieuDe(String tieuDe) {
            this.tieuDe = tieuDe;
            return this;
        }

        public Builder withNoiDung(String noiDung) {
            this.noiDung = noiDung;
            return this;
        }

        public Builder withBieuTuong(String bieuTuong) {
            this.bieuTuong = bieuTuong;
            return this;
        }

        public Builder withAmThanh(String amThanh) {
            this.amThanh = amThanh;
            return this;
        }

        public Builder withNutHanhDong(String nutHanhDong) {
            this.nutHanhDong = nutHanhDong;
            return this;
        }

        public Builder withDoUuTien(int doUuTien) {
            this.doUuTien = doUuTien;
            return this;
        }

        public Notification build() {
            return new Notification(this);
        }
    }
}