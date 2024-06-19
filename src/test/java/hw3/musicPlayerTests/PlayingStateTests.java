package hw3.musicPlayerTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import hw3.musicPlayer.MusicPLayer;
import hw3.musicPlayer.PauseState;

public class PlayingStateTests extends BaseTest{
    @Test
    @DisplayName("Play next track test")
    public void verifyNextPlay(){
        MusicPLayer musicPLayer = new MusicPLayer(playlist);
        musicPLayer.play();
        musicPLayer.next();
        Assertions.assertTrue(musicPLayer.getCurrentTrack().getTrackName().equals("Ain't no way"), musicPLayer.getCurrentTrack().getTrackName() + " track is playing now.");
    }

    @Test
    @DisplayName("Go next until the last track test")
    public void verifyNextTillTheEnd(){
        MusicPLayer musicPLayer = new MusicPLayer(playlist);
        musicPLayer.play();
        musicPLayer.next();
        musicPLayer.next();
        musicPLayer.next();
        Assertions.assertTrue(musicPLayer.getCurrentTrack().getTrackName().equals("I would rather go blind"), musicPLayer.getCurrentTrack().getTrackName() + " track is playing now.");
    }

    @Test
    @DisplayName("Go to previous until the first track test")
    public void verifyPrevTillTheFirst(){
        MusicPLayer musicPLayer = new MusicPLayer(playlist);
        musicPLayer.play();
        musicPLayer.next();
        musicPLayer.next();
        musicPLayer.previous();
        musicPLayer.previous();
        Assertions.assertTrue(musicPLayer.getCurrentTrack().getTrackName().equals("I would rather go blind"), musicPLayer.getCurrentTrack().getTrackName() + " track is playing now.");
    }

    @Test
    @DisplayName("Go previous when the first track is playing test")
    public void verifyPrevWhenFirstTrackIsPLaying(){
        MusicPLayer musicPLayer = new MusicPLayer(playlist);
        musicPLayer.play();
        musicPLayer.previous();
        Assertions.assertTrue(musicPLayer.getCurrentTrack().getTrackName().equals("I would rather go blind"), musicPLayer.getCurrentTrack().getTrackName() + " track is playing now.");
    }

    @Test
    @DisplayName("Repeat track test")
    public void VerifyRepeat(){
        MusicPLayer musicPLayer = new MusicPLayer(playlist);
        musicPLayer.play();
        musicPLayer.repeat();
        Assertions.assertTrue(musicPLayer.getCurrentTrack().getTrackName().equals("I would rather go blind"), musicPLayer.getCurrentTrack().getTrackName() + " track is playing now.");
    }

    @Test
    @DisplayName("Pause track test")
    public void VerifyPause(){
        MusicPLayer musicPLayer = new MusicPLayer(playlist);
        musicPLayer.play();
        musicPLayer.stop();
        Assertions.assertInstanceOf(PauseState.class, musicPLayer.getPlayerState().getClass());
    }
}
