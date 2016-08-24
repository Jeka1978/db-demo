package factory;

/**
 * Created by Jeka on 24/08/2016.
 */
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;



    public void cleanRoom(){
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }
}
