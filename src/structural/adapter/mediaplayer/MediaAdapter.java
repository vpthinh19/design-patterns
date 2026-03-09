package structural.adapter.mediaplayer;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter() {
    }

    @Override
    public void play(String type, String name) {
        switch (type.strip().toLowerCase()){
            case "mp4":
                advancedMediaPlayer = new MP4Player();
                break;
            case "vlc":
                advancedMediaPlayer = new VLCPlayer();
                break;
            default:
                return;
        }
        advancedMediaPlayer.playAdvanced(name);
        advancedMediaPlayer = null;
    }
}
