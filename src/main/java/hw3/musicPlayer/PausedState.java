package hw3.musicPlayer;

public class PausedState implements PlayerState {

    private MusicPlayer musicPLayer;

    public PausedState(MusicPlayer musicPLayer) {
        this.musicPLayer = musicPLayer;
        System.out.println("The music is stopped.");
    }

    @Override
    public void playOrPause() {
        System.out.println("Start playing the " + "\"" + musicPLayer.getCurrentTrack() + "\"");
        musicPLayer.setPlayerState(new PlayingState(musicPLayer));
    }

    @Override
    public void stop() {
        System.out.println("Turning the player off");
        musicPLayer.setPlayerState(new OffState(musicPLayer));

    }

    @Override
    public void next() {
        System.out.println("Next.. Start playing the " + "\"" + musicPLayer.getCurrentTrack() + "\"");
        musicPLayer.setPlayerState(new PlayingState(musicPLayer));
    }

    @Override
    public void previous() {
        System.out.println("Previous.. Start playing the " + "\"" + musicPLayer.getCurrentTrack() + "\"");
        musicPLayer.setPlayerState(new PlayingState(musicPLayer));
    }
}
