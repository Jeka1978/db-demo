package factory;

/**
 * Created by Jeka on 24/08/2016.
 */
public class IRobot {
    private Speaker speaker = ObjectFactory.getInstance().createObject(Speaker.class);
    private Cleaner cleaner = ObjectFactory.getInstance().createObject(Cleaner.class);

    public void cleanRoom(){
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }
}
