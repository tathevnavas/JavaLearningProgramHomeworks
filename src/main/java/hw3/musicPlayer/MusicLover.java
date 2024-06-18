package hw3.musicPlayer;

import java.util.ArrayList;
import java.util.List;

public class MusicLover {
    public static void main(String[] args) {
        List<Music> playlist = new ArrayList();
        playlist.add(new Music("I would rather go blind"));
        playlist.add(new Music("Ain't no way"));
        playlist.add(new Music("I found a love"));

        var playMusic = new MusicPlayer(playlist);
        playMusic.setOnRepeat();
        playMusic.playOrPause();
        playMusic.playOrPause();
        playMusic.playOrPause();
        playMusic.next();
        playMusic.next();
        playMusic.next();
        playMusic.previous();
        playMusic.stop();
    }
}
