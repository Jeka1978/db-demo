package springannotations.qualifiers;

import org.springframework.stereotype.Repository;

/**
 * Created by Evegeny on 29/08/2016.
 */
@DBRepo(DBType.MONGO)
public class DaoImpl implements Dao {
    @Override
    public void save() {
        System.out.println("Saving to Mongo...");
    }
}
