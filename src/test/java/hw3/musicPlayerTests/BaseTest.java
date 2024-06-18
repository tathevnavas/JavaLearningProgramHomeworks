package hw3.musicPlayerTests;

import java.util.ArrayList;

import hw3.musicPlayer.Music;

public class BaseTest {
    protected ArrayList<Music> playlist = new ArrayList<Music>(){
        {
            add(new Music("I would rather go blind"));
            add(new Music("Ain't no way"));
            add(new Music("I found a love"));
        }
    };
}
