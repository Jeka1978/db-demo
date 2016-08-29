package spring.quoters.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 26/08/2016.
 */
@Component
public class BeanDefinitionFixerBeanPostProcessor implements BeanPostProcessor {
    @Autowired
    private ConfigurableListableBeanFactory factory;
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        BeanDefinition beanDefinition = factory.getBeanDefinition(beanName);
        String beanClassName = beanDefinition.getBeanClassName();
        if (beanClassName == null) {
            beanDefinition.setBeanClassName(bean.getClass().getName());
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
