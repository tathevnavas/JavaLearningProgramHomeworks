package hw3.musicPlayer;

public class OffState implements Player {
    public OffState(){
        System.out.println("The player was off.");
    }
    @Override
    public void playOrPause(MusicPLayer musicPLayer) {
        System.out.println("Going from OFF to ON.");
        musicPLayer.setPlayerState(new OnState());
    }

    @Override
    public void stop(MusicPLayer musicPLayer) {
        System.out.println("The player is turned off. Unable to stop.");
    }

    @Override
    public void next(MusicPLayer musicPLayer) {
        System.out.println("The player is turned off. Unable to go to next.");
    }

    @Override
    public void previous(MusicPLayer musicPLayer) {
        System.out.println("The player is turned off. Unable to got to previous.");
    }

    @Override
    public void repeat(MusicPLayer musicPLayer) {
        System.out.println("The player is turned off. Unable to got to repeat.");
    }
}
