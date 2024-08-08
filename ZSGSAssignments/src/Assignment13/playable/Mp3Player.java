package Assignment13.playable;

public class Mp3Player implements Playable{
    @Override
    public void play() {
        System.out.println("Mp3Player is played");
    }

    @Override
    public void pause() {
        System.out.println("Mp3Player is paused");
    }

    @Override
    public void stop() {
        System.out.println("Mp3Player is stopped");
    }
}
