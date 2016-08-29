package spring.quoters.bpp;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import spring.quoters.DeprecatedClass;

/**
 * Created by Evegeny on 29/08/2016.
 */
public class DeprecatedClassAnnotationSubstitutionBeanFactoryPostProcessor  implements BeanFactoryPostProcessor{
    @Override
    @SneakyThrows
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] names = beanFactory.getBeanDefinitionNames();
        for (String name : names) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
            String beanClassName = beanDefinition.getBeanClassName();
            if (beanClassName == null) {
                continue;
            }
            Class<?> beanClass = Class.forName(beanClassName);
            DeprecatedClass annotation = beanClass.getAnnotation(DeprecatedClass.class);
            if (annotation != null) {
                beanDefinition.setBeanClassName(annotation.value().getName());
            }
        }
    }
}





