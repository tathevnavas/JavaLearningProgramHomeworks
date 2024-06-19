package hw3.musicPlayer;

public class PauseState implements PlayerState {
    private MusicPLayer player;
    public PauseState(MusicPLayer player){
        this.player = player;
        System.out.println("The music is stopped.");
    }

    @Override
    public void playOrPause() {
        System.out.println("Playing the " + player.getCurrentTrack().getTrackName() + " track.");
        player.setPlayerState(new PlayingState(player));
    }

    @Override
    public void stop() {
        System.out.println("Already stopped playing " + player.getCurrentTrack().getTrackName());
    }

    @Override
    public void next() {
        player.next();
    }

    @Override
    public void previous() {
        player.previous();
    }

    @Override
    public void repeat() {
        playOrPause();
    }
}
