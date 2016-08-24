package factory;

import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Jeka on 24/08/2016.
 */
public class BenchmarkProxyConfigurator implements ProxyConfigurator {
    @Override
    public Object wrapWithProxy(Object t, Class type) {
        boolean isOneOfTheMethodsAnnotatedWithBenchmark = false;
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Benchmark.class)) {
                isOneOfTheMethodsAnnotatedWithBenchmark = true;
                break;
            }
        }
        if (type.isAnnotationPresent(Benchmark.class) || isOneOfTheMethodsAnnotatedWithBenchmark) {
            if (type.getInterfaces().length == 0) {
                return Enhancer.create(type, (org.springframework.cglib.proxy.InvocationHandler) (proxy, method, args) -> invocationHandlerInvoke(t, type, method, args));
            }else {
                return Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), (proxy, method, args) -> invocationHandlerInvoke(t, type, method, args));
            }
        }
        return t;
    }

    private Object invocationHandlerInvoke(Object t, Class type, Method method, Object[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method originalClassMethod = type.getMethod(method.getName(), method.getParameterTypes());
        if (type.isAnnotationPresent(Benchmark.class) || originalClassMethod.isAnnotationPresent(Benchmark.class)) {
            System.out.println("*********BENCHMARK***************");
            long start = System.nanoTime();
            Object retVal = method.invoke(t, args);
            long end = System.nanoTime();
            System.out.println("method " + method.getName() + " worked for " + (end - start));
            System.out.println("*********BENCHMARK***************");
            return retVal;
        } else {
            return method.invoke(t, args);
        }
    }
}






