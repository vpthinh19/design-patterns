package structural.adapter.mediaplayer;

public class MP4Player implements AdvancedMediaPlayer{
    public MP4Player() {
    }

    @Override
    public void playAdvanced(String name) {
        System.out.println("Play " + name + " in MP4 format");
    }
}
