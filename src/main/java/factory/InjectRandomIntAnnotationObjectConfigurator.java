package factory;

import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Random;
import java.util.Set;

/**
 * Created by Jeka on 24/08/2016.
 */
public class InjectRandomIntAnnotationObjectConfigurator implements ObjectConfigurator {
    @Override
    public void configure(Object t) throws Exception {
        Class<?> type = t.getClass();
        Set<Field> fields = ReflectionUtils.getAllFields(type);
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomInt.class)) {
                InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
                int min = annotation.min();
                int max = annotation.max();
                Random random = new Random();
                int value = min + random.nextInt(max - min);
                field.setAccessible(true);
                field.set(t,value);
            }
        }
    }
}
