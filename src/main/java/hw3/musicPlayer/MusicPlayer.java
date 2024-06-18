package hw3.musicPlayer;

import java.util.ArrayList;
import java.util.List;

// maybe methods to add and remove music from playlist will be useful
public class MusicPlayer {
    List<Music> playlist;
    private Integer currentTrack;
    private Boolean repeatEnabled;
    private PlayerState currentState;

    public MusicPlayer(List<Music> newPlaylist) {
        playlist = newPlaylist;
        repeatEnabled = false;
        currentTrack = 0;
        currentState = new OffState(this);
    }

    public Boolean isOnRepeat() {
        return repeatEnabled;
    }

    public void setOnRepeat() {
        repeatEnabled = true;
    }

    public void disableRepeat() {
        repeatEnabled = false;
    }

    public void playOrPause() {
        currentState.playOrPause();
    }

    public void stop() {
        currentState.stop();
    }

    public void next() {
        if (currentState.getClass() != OffState.class) {
            boolean lastTrack = currentTrack == playlist.size() - 1;

            if (repeatEnabled || !lastTrack) {
                if (lastTrack) {
                    currentTrack = 0;
                } else {
                    currentTrack = currentTrack + 1;
                }
                currentState.next();
            } else {
                System.out.println("Already on the last track");
            }
        }
    }

    public void previous() {
        if (currentState.getClass() != OffState.class) {
            if (currentTrack > 0) {
                currentTrack = currentTrack - 1;
                currentState.previous();
            } else {
                System.out.println("Already at the very first track");
            }
        }
    }

    void setPlayerState(PlayerState playerState) {
        currentState = playerState;
    }

    String getCurrentTrack() {
        return playlist.get(currentTrack).getTrackName();
    }
}
