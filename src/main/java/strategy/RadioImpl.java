package strategy;

/**
 * Created by Jeka on 23/08/2016.
 */
public class RadioImpl implements Radio {
    @Override
    public void setChannel(double channel) {
        System.out.println("channel = " + channel);
    }

    @Override
    public void play() {
        System.out.println("playing...");
    }
}
