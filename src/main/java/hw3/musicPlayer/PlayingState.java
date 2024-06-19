package hw3.musicPlayer;

public class PlayingState implements PlayerState {
    private MusicPLayer player;
    public PlayingState(MusicPLayer player){
        this.player = player;
        System.out.println(player.getCurrentTrack().getTrackName() + " music is playing now.");
    }
    @Override
    public void playOrPause() {
        player.setPlayerState(new PauseState(player));
        System.out.println("Stopped " + player.getCurrentTrack().getTrackName() + " track.");
    }

    @Override
    public void stop() {
        playOrPause();
    }

    @Override
    public void next() {
        player.getPlayerState().stop();
        player.next();
    }

    @Override
    public void previous() {
        player.getPlayerState().stop();
        player.previous();
    }

    @Override
    public void repeat() {
        playOrPause();//this is to stop current playing
        playOrPause();// this is to restart the stopped playing
    }

}
