package springannotations.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static springannotations.qualifiers.DBType.MONGO;
import static springannotations.qualifiers.DBType.ORACLE;

/**
 * Created by Evegeny on 29/08/2016.
 */
@Service
@EnableScheduling
public class DBService {
    @DBRepo(ORACLE)
    private Dao backupDao;

    @DBRepo(MONGO)
    private Dao dao;

    @Scheduled(cron = "1/1 * * * * ?")
    public void save(){
        dao.save();
    }

    @Scheduled(cron = "1/3 * * * * ?")
    public void backup(){
        backupDao.save();
    }


}
