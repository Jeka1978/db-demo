package strategy;

import java.time.LocalTime;

/**
 * Created by Jeka on 23/08/2016.
 */
public class RadioAlarm implements Radio,Alarm {
    private Alarm alarm = new AlarmImpl();
    private Radio radio = new RadioImpl();

    public void setTime(LocalTime time) {
        this.alarm.setTime(time);
    }

    public void stop() {
        this.alarm.stop();
    }

    public void setChannel(double channel) {
        this.radio.setChannel(channel);
    }

    public void play() {
        this.radio.play();
    }
}
