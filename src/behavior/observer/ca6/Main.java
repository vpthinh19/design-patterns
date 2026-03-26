package behavior.observer.ca6;

public class Main {
    static void main() {
        PlayerData data = new PlayerData(300.0, 10, 0);
        DashBoard dashBoard = new DashBoard(data);
        System.out.println(data);
        data.setThoiGian(250.0);
        data.setGrade(1.0);
        data.setCountdown(9);
    }
}