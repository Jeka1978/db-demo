package springprofiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * Created by Evegeny on 30/08/2016.
 */
@Repository
@Profile("PROD")
//spring.profiles.active = PROD
public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void promoteEmployee(String name) {
        System.out.println(name+" was promoted");
    }
}
