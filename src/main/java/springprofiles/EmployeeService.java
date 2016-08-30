package springprofiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 30/08/2016.
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Value("${name}")
    private String name;

    @PostConstruct
    public void init() {
        employeeDao.promoteEmployee(name);
    }
}
