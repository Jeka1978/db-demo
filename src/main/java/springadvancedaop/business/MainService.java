package springadvancedaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Evegeny on 30/08/2016.
 */
@Service
public class MainService {
    @Autowired
    private Dao dao;

    public void doWork() {
        dao.save();
    }
}
