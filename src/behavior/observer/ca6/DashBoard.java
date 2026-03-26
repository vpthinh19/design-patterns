package behavior.observer.ca6;

public class DashBoard implements PlayerDataListener {
    private PlayerData playerData;

    public DashBoard(PlayerData playerData) {
        this.playerData = playerData;
        playerData.dangKy(this);
    }

    @Override
    public void listen(PlayerData data) {
        System.out.println(data);
    }
}
