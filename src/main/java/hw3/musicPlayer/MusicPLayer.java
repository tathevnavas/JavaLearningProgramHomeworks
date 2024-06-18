package hw3.musicPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MusicPLayer {
    List<Music> playlist;
    Music currentTrack;
    private Player currentState;

    public MusicPLayer(ArrayList<Music> playlist) {
        this.playlist = playlist;
        setFirstTrack();
        currentState = new OffState();
    }

    public Player getPlayerState() {
        return currentState;
    }

    public void setPlayerState(Player player) {
        this.currentState = player;
    }

    public Music getCurrentTrack() {
        return currentTrack;
    }

    public void turnOff() {
        currentState.turnOff();
    }

    public void play() {
        currentState.playOrPause(this);
    }

    public void repeat(){
        currentState.repeat(this);
    }

    public void stop() {
        currentState.stop(this);
    }

    public void next() {
        currentState.playOrPause(this);
        var i = playlist.indexOf(currentTrack);
        if (i == playlist.size() - 1) {
            currentTrack = playlist.get(0);
            System.out.println("Replaying first track: " + playlist.get(0).getTrackName());
        } else {
            currentTrack = playlist.get(i + 1);
        }
        currentState.playOrPause(this);
    }

    public void previous() {
        currentState.playOrPause(this);
        var i = playlist.indexOf(currentTrack);
        if (i > 0) {
            currentTrack = playlist.get(i - 1);
        } else {
            System.out.println("Already on the first track.");
        }
        currentState.playOrPause(this);
    }

    private void setFirstTrack() {
        currentTrack = playlist.stream().findFirst().orElseThrow(NoSuchElementException::new);
    }
}
