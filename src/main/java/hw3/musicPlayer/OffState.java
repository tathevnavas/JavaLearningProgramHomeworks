package hw3.musicPlayer;

public class OffState implements PlayerState {

    private MusicPlayer musicPLayer;

    public OffState(MusicPlayer musicPLayer) {
        this.musicPLayer = musicPLayer;
        System.out.println("The player is off.");
    }

    @Override
    public void playOrPause() {
        System.out.println("Going from OFF to ON.");
        musicPLayer.setPlayerState(new PlayingState(musicPLayer));
    }

    @Override
    public void stop() {
    }

    @Override
    public void next() {
    }

    @Override
    public void previous() {
    }
}
