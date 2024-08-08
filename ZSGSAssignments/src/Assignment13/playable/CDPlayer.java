package Assignment13.playable;

public class CDPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("CDPlayer is played");
    }

    @Override
    public void pause() {
        System.out.println("CDPlayer is paused");
    }

    @Override
    public void stop() {
        System.out.println("CDPlayer is stopped");
    }
}
