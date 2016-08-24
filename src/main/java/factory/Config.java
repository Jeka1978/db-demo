package factory;

/**
 * Created by Jeka on 24/08/2016.
 */
public interface Config {
    <T> Class<T> getImplClass(Class<T> type);
}
