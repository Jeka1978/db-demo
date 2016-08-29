package springannotations.qualifiers;

import lombok.SneakyThrows;

/**
 * Created by Evegeny on 29/08/2016.
 */
@DBRepo(DBType.ORACLE)
public class BackupDao implements Dao {
    @Override
    @SneakyThrows
    public void save() {
        System.out.println("Bacuping...");
        Thread.sleep(500);
    }
}
