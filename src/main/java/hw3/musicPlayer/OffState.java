package hw3.musicPlayer;

public class OffState implements Player {
    public OffState(){
        System.out.println("No music is playing now.");
    }
    @Override
    public void playOrPause(MusicPLayer musicPLayer) {
        System.out.println("The player was off. Going from OFF to ON.");
        musicPLayer.setPlayerState(new OnState());
    }

    @Override
    public void stop(MusicPLayer musicPLayer) {
        System.out.println("The player is turned off.");
    }

    @Override
    public void next(MusicPLayer musicPLayer) {
        System.out.println("The player is turned off.");
    }

    @Override
    public void previous(MusicPLayer musicPLayer) {
        System.out.println("The player is turned off.");
    }
}
