package hw3.musicPlayer;

import java.util.ArrayList;
import java.util.List;

public class MusicLover {
    public static void main(String[] args) {
        List<Music> playlist = new ArrayList<>(){
            {
                add(new Music("1st track"));
                add(new Music("2nd track"));
                add(new Music("3rdt track"));
            }
        };

        var playMusic = new MusicPLayer((ArrayList<Music>) playlist);
    }
}
