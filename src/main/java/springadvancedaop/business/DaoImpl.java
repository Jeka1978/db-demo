package springadvancedaop.business;

import org.springframework.stereotype.Repository;

/**
 * Created by Evegeny on 30/08/2016.
 */
@Repository
public class DaoImpl implements Dao {
    @Override
    public void save() {
        System.out.println("saving...");
        throw new DBRuntimeException("database is dead");
    }
}
