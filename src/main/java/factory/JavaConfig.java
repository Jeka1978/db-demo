package factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jeka on 24/08/2016.
 */
public class JavaConfig implements Config {
    private Map<Class, Class> map = new HashMap<>();


    public JavaConfig() {
        map.put(Speaker.class, ConsoleSpeaker.class);
        map.put(Cleaner.class, PowerCleaner.class);
    }

    @Override
    public <T> Class<T> getImplClass(Class<T> type) {
        return map.get(type);
    }
}
