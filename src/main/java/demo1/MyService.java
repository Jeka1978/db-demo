package demo1;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jeka on 22/08/2016.
 */
public class MyService implements BeanPostProcessor{
    @Override
    @SneakyThrows
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        Class<?> aClass = o.getClass();
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Autowired.class)) {
                field.set(o,1);
            }
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {

        List<String> strings = Arrays.asList("str", "str2");
        strings.forEach(System.out::println);
        System.gc();
        return o;
    }

}
