package springannotations.screensaver2.screensaver;

import factory.Benchmark;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evegeny on 29/08/2016.
 */
@Component
public class BenchmarkBPP implements BeanPostProcessor {
    private Map<String, Class> map = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanClass = bean.getClass();
        Method[] methods = beanClass.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Benchmark.class)) {
                map.put(beanName, beanClass);
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class beanClass = map.get(beanName);
        if (beanClass != null) {
            return Enhancer.create(beanClass, (InvocationHandler) (o, method, args) ->{
                Method originalMethod = beanClass.getMethod(method.getName(), method.getParameterTypes());
                if (originalMethod.isAnnotationPresent(Benchmark.class)) {
                    System.out.println("BENCHMARK*************");
                    Object retVal = method.invoke(bean, args);
                    System.out.println("BENCHMARK*************");
                    return retVal;
                }else {
                    return method.invoke(bean, args);
                }
            });
        }
        return bean;
    }
}
