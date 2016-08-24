package factory;

/**
 * Created by Jeka on 24/08/2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        while (true) {
            iRobot.cleanRoom();
            Thread.sleep(2000);
        }
      /*  MyService<Integer> service = ObjectFactory.getInstance().createObject(MyService.class);
        service.a(12);
        service.b();*/
    }
}
