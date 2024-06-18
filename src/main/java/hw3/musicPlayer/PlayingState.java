package hw3.musicPlayer;

public class PlayingState implements PlayerState {

    private MusicPlayer musicPLayer;

    public PlayingState(MusicPlayer musicPLayer) {
        this.musicPLayer = musicPLayer;
        System.out.println("Music player is playing now the song " + "\"" + musicPLayer.getCurrentTrack() + "\"");
    }

    @Override
    public void playOrPause() {
        System.out.println("Stop playing " + "\"" + musicPLayer.getCurrentTrack() + "\"");
        musicPLayer.setPlayerState(new PausedState(musicPLayer));
    }

    @Override
    public void stop() {
        System.out.println("Turning off the player.");
        musicPLayer.setPlayerState(new OffState(musicPLayer));
    }

    @Override
    public void next() {
        System.out.println("Next.. Start playing the " + "\"" + musicPLayer.getCurrentTrack() + "\"");
    }

    @Override
    public void previous() {
        System.out.println("Previous.. Start playing the " + "\"" + musicPLayer.getCurrentTrack() + "\"");
    }
}
