package hw3.musicPlayer;

import java.util.ArrayList;
import java.util.List;

public class MusicLover {
    public static void main(String[] args) {
        List<Music> playlist = new ArrayList<>(){
            {
                add(new Music("I would rather go blind"));
                add(new Music("Ain't no way"));
                add(new Music("I found a love"));
            }
        };

        var playMusic = new MusicPLayer((ArrayList<Music>) playlist);
        playMusic.play();
        System.out.println("----" + playMusic.getPlayerState());
        playMusic.stop();
        System.out.println("----" + playMusic.getPlayerState());
        playMusic.play();
        System.out.println("----" + playMusic.getPlayerState());
        playMusic.next();
        System.out.println("----" + playMusic.getPlayerState());
        playMusic.next();
        System.out.println("----" + playMusic.getPlayerState());
        playMusic.previous();
        System.out.println("----" + playMusic.getPlayerState());
        playMusic.stop();
    }
}
