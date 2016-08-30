package spring;

import factory.MyService;

/**
 * Created by Evegeny on 30/08/2016.
 */
public class MockConfig extends JavaConfig {
    @Override
    public MyService myService() {
        return null;
    }
}
