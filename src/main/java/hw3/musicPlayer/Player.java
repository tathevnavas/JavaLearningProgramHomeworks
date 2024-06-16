package hw3.musicPlayer;

public interface Player {
    void playOrPause(MusicPLayer musicPLayer);
    void stop(MusicPLayer musicPLayer);
    void next(MusicPLayer musicPLayer);
    void previous(MusicPLayer musicPLayer);
    default void turnOff(){
        System.out.println("Turning off the player.");
    };
}
