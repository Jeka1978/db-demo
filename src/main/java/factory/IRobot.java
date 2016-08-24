package factory;

import javax.annotation.PostConstruct;

/**
 * Created by Jeka on 24/08/2016.
 */
@Benchmark
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    @PostConstruct
    public void init() {
        System.out.println(cleaner.getClass().getName());
    }

    public void cleanRoom(){
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }
}
