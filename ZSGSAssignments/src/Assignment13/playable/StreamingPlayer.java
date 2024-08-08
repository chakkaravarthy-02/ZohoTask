package Assignment13.playable;

public class StreamingPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("StreamPlayer is played");
    }

    @Override
    public void pause() {
        System.out.println("StreamPlayer is paused");
    }

    @Override
    public void stop() {
        System.out.println("StreamPlayer is stopped");
    }
}
