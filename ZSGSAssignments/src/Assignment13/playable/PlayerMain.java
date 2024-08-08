package Assignment13.playable;

public class PlayerMain {
    public static void main(String[] args) {
        CDPlayer cdPlayer=new CDPlayer();
        StreamingPlayer streamingPlayer=new StreamingPlayer();
        Mp3Player mp3Player=new Mp3Player();

        cdPlayer.play();
        cdPlayer.pause();
        cdPlayer.stop();

        streamingPlayer.play();
        streamingPlayer.pause();
        streamingPlayer.stop();

        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();
    }
}
