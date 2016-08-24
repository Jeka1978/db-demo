package factory;

import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Set;

/**
 * Created by Jeka on 24/08/2016.
 */
public class InjectByTypeAnnotationObjectConfigurator implements ObjectConfigurator {
    @Override
    public void configure(Object t) throws Exception {
        Set<Field> fields = ReflectionUtils.getAllFields(t.getClass());
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                Object value = ObjectFactory.getInstance().createObject(field.getType());
                field.setAccessible(true);
                field.set(t,value);
            }
        }
    }
}
