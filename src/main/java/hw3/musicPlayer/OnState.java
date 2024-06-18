package hw3.musicPlayer;

public class OnState implements Player{
    public OnState(){
        System.out.println("Music player is on now.");
    }
    @Override
    public void playOrPause(MusicPLayer musicPLayer) {
        if(musicPLayer.getPlayerState().toString().contains("OnState")){
            musicPLayer.setPlayerState(new StopState());
            System.out.println("Stopped " + musicPLayer.getCurrentTrack().getTrackName() + " track.");
        } else if (musicPLayer.getPlayerState().toString().contains("StopState")){
            musicPLayer.setPlayerState(new OnState());
            System.out.println("Playing " + musicPLayer.getCurrentTrack().getTrackName() + " track.");
        }
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

    @Override
    public void repeat(MusicPLayer musicPLayer) {
        playOrPause(musicPLayer);//this is to stop current playing
        playOrPause(musicPLayer);// this is to restart the stopped playing
    }
}
