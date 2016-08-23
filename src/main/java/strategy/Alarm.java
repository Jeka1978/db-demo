package strategy;

import java.time.LocalTime;
import java.util.Date;

/**
 * Created by Jeka on 23/08/2016.
 */
public interface Alarm {
    void stop();

    void setTime(LocalTime time);
}
