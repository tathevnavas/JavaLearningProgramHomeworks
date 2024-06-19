package hw3.musicPlayerTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import hw3.musicPlayer.MusicPLayer;

public class OffStateTests extends BaseTest{
    @Test
    @DisplayName("Stop when the player is off")
    public void verifyStopWhenPlayerIsOff(){
        MusicPLayer musicPLayer = new MusicPLayer(playlist);
        musicPLayer.stop();
        Assert.assertTrue("Music player is not off actually.",musicPLayer.getPlayerState().toString().contains("OffState"));
    }

    @Test
    @DisplayName("Play when the player is off")
    public void verifyPlayWhenPlayerIsOff(){
        MusicPLayer musicPLayer = new MusicPLayer(playlist);
        musicPLayer.play();
        Assert.assertTrue("Music player is not on actually.", musicPLayer.getPlayerState().toString().contains("PlayingState"));
    }

    @Test
    @DisplayName("Repeat when the player is off")
    public void verifyRepeatWhenPlayerIsOff(){
        MusicPLayer musicPLayer = new MusicPLayer(playlist);
        musicPLayer.repeat();
        Assert.assertTrue("Music player is not off actually.", musicPLayer.getPlayerState().toString().contains("OffState"));
    }

    @Test
    @DisplayName("Repeat track test")
    public void VerifyRepeat(){
        MusicPLayer musicPLayer = new MusicPLayer(playlist);
        musicPLayer.repeat();

        Assert.assertTrue("Music player is not off actually.", musicPLayer.getPlayerState().toString().contains("OffState"));
    }
}
