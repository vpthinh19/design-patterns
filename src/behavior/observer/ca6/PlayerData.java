package behavior.observer.ca6;

public class PlayerData {
    private PlayerDataListener listener;
    private double thoiGian;
    private int countdown;
    private double grade;

    public PlayerData(double thoiGian, int countdown, double grade) {
        this.thoiGian = thoiGian;
        this.countdown = countdown;
        this.grade = grade;
    }
    public void dangKy(PlayerDataListener l){
        this.listener = l;
    }
    public void huyDangKy(PlayerDataListener l){
        this.listener = null;
    }
    private void thongBao(){
        if (this.listener != null){
            this.listener.listen(this);
        }
    }

    public void setThoiGian(double thoiGian) {
        this.thoiGian = thoiGian;
        this.thongBao();
    }

    public void setCountdown(int countdown) {
        this.countdown = countdown;
        this.thongBao();
    }

    public void setGrade(double grade) {
        this.grade = grade;
        this.thongBao();
    }

    public double getThoiGian() {
        return thoiGian;
    }

    public int getCountdown() {
        return countdown;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "PlayerData{" +
                "thoiGian=" + thoiGian +
                ", countdown=" + countdown +
                ", grade=" + grade +
                '}';
    }
}
