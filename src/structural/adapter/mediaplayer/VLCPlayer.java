package structural.adapter.mediaplayer;

public class VLCPlayer implements AdvancedMediaPlayer{
    public VLCPlayer() {
    }

    @Override
    public void playAdvanced(String name) {
        System.out.println("Play " + name + " in VLC format");
    }
}
