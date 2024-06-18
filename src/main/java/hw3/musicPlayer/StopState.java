package hw3.musicPlayer;

public class StopState implements Player{
    public StopState(){
        System.out.println("The music is stopped.");
    }

    @Override
    public void playOrPause(MusicPLayer musicPLayer) {
        System.out.println("Playing the " + musicPLayer.getCurrentTrack().getTrackName() + " track.");
        musicPLayer.setPlayerState(new OnState());
    }

    @Override
    public void stop(MusicPLayer musicPLayer) {
        System.out.println("Already stopped playing " + musicPLayer.getCurrentTrack().getTrackName());
    }

    @Override
    public void next(MusicPLayer musicPLayer) {
        musicPLayer.next();
    }

    @Override
    public void previous(MusicPLayer musicPLayer) {
        musicPLayer.previous();
    }

    @Override
    public void repeat(MusicPLayer musicPLayer) {
        playOrPause(musicPLayer);
    }
}
