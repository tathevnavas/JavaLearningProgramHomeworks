package hw3.musicPlayer;

public interface PlayerState {
    void playOrPause();
    void stop();
    void next();
    void previous();
}
