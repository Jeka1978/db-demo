package spring.quoters.bpp;

import factory.Benchmark;
import factory.InjectRandomInt;
import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.annotation.Order;
import org.springframework.util.ClassUtils;

import java.lang.annotation.Target;
import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * Created by Evegeny on 26/08/2016.
 */
public class BenchmarkAnnotationBeanPostProcessor implements BeanPostProcessor {
    @Autowired
    private ConfigurableListableBeanFactory factory;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        BeanDefinition beanDefinition = factory.getBeanDefinition(beanName);
        String beanClassName = beanDefinition.getBeanClassName();
        Class<?> beanClass = ClassUtils.resolveClassName(beanClassName, ClassLoader.getSystemClassLoader());
        if (beanClass.isAnnotationPresent(Benchmark.class)) {
            return Proxy.newProxyInstance(beanClass.getClassLoader(),beanClass.getInterfaces(), (proxy, method, args) -> {
                System.out.println("****BENCHMARK******");
                Object retVal = method.invoke(bean, args);
                System.out.println("****BENCHMARK******");
                return retVal;
            });
        }
        return bean;
    }
}
