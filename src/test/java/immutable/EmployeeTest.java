package immutable;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jeka on 22/08/2016.
 */
public class EmployeeTest {
    @Test
    public void addBonus() throws Exception {
        Employee tanya = new Employee("Tanya", 3000, 300, 18);
        tanya = tanya.addBonus(200);
        Assert.assertEquals(500, tanya.getBonus());
    }

}