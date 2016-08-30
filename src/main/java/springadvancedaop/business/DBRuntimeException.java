package springadvancedaop.business;

/**
 * Created by Evegeny on 30/08/2016.
 */
public class DBRuntimeException extends RuntimeException {
    public DBRuntimeException(String message) {
        super(message);
    }
}
