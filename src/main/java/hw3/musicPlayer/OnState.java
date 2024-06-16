package hw3.musicPlayer;

public class OnState implements Player{
    public OnState(){
        System.out.println("MusicPLayer is playing now.");
    }
    @Override
    public void playOrPause(MusicPLayer musicPLayer) {
        System.out.println("Stopping " + musicPLayer.getCurrentTrack().getTrackName());
        musicPLayer.setPlayerState(new StopState());
    }

    @Override
    public void stop(MusicPLayer musicPLayer) {
        playOrPause(musicPLayer);
    }

    @Override
    public void next(MusicPLayer musicPLayer) {
        musicPLayer.getPlayerState().stop(musicPLayer);
        musicPLayer.next();
    }

    @Override
    public void previous(MusicPLayer musicPLayer) {
        musicPLayer.getPlayerState().stop(musicPLayer);
        musicPLayer.previous();
    }
}
