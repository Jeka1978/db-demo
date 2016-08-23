package strategy;

import java.time.LocalTime;

/**
 * Created by Jeka on 23/08/2016.
 */
public class AlarmImpl implements Alarm {
    @Override
    public void stop() {
        System.out.println("stopped");
    }

    @Override
    public void setTime(LocalTime time) {
        System.out.println(time);
    }
}
