package structural.adapter.mediaplayer;

public class AudioPlayer implements MediaPlayer{
    public AudioPlayer() {
    }

    @Override
    public void play(String type, String name) {
        if (type.equalsIgnoreCase("mp3")){
            System.out.println("Play " + name + " in MP3 format");
        } else if (type.equalsIgnoreCase("mp4") || type.equalsIgnoreCase("vlc")) {
            MediaAdapter adapter = new MediaAdapter();
            adapter.play(type, name);
        }
        else {
            System.out.println("Unsupported format");
        }
    }
}
