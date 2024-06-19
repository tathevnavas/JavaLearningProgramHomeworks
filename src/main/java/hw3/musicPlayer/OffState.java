package hw3.musicPlayer;

public class OffState implements PlayerState {
    private MusicPLayer player;
    public OffState(MusicPLayer player){
        this.player = player;
        System.out.println("The player was off.");
    }
    @Override
    public void playOrPause() {
        System.out.println("Going from OFF to ON.");
        player.setPlayerState(new PlayingState(player));
    }

    @Override
    public void stop() {
        System.out.println("The player is turned off. Unable to stop.");
    }

    @Override
    public void next() {
        System.out.println("The player is turned off. Unable to go to next.");
    }

    @Override
    public void previous() {
        System.out.println("The player is turned off. Unable to got to previous.");
    }

    @Override
    public void repeat() {
        System.out.println("The player is turned off. Unable to got to repeat.");
    }
}
