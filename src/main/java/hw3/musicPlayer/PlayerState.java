package hw3.musicPlayer;

public interface PlayerState {
    void playOrPause();
    void stop();
    void next();
    void previous();
    void repeat();
    default void turnOff(){
        System.out.println("Turning off the player.");
    }
}
