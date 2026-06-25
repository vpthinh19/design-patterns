package gk.bai3;

public class Main {
    static void main() {
        Notification simpleNotif = new Notification.Builder()
                .withTieuDe("Tin nhắn mới")
                .withNoiDung("Bạn có 1 tin nhắn từ abcxyz")
                .build();

        Notification complexNotif = new Notification.Builder()
                .withTieuDe("Cập nhật hệ thống")
                .withNoiDung("Bản cập nhật v2.0 đã sẵn sàng")
                .withBieuTuong("update_icon.png")
                .withAmThanh("ding.mp3")
                .withNutHanhDong("Tải xuống ngay")
                .withDoUuTien(1)
                .build();

        System.out.println(simpleNotif);
        System.out.println(complexNotif);
    }
}
