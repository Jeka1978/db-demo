package factory;

import javax.annotation.PostConstruct;
import java.lang.ref.WeakReference;

/**
 * Created by Jeka on 24/08/2016.
 */
@Benchmark
@Singleton
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private WeakReference<Cleaner> cleaner;

    @PostConstruct
    public void init() {
        System.out.println(cleaner.getClass().getName());
    }

    public void cleanRoom(){
        speaker.speak("I started");
        Cleaner cleaner = this.cleaner.get();
        if (cleaner != null) {
            cleaner.clean();
        }
        speaker.speak("I finished");
    }
}
