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
        Employee.Builder builder = new Employee.Builder();
        Employee tanya = builder.bonus(300).name("Tanya").salary(3000).build();


        tanya = tanya.addBonus(200);
        Assert.assertEquals(500,tanya.getBonus());
    }

    @Test(expected = IllegalStateException.class)
    public void testBuilderCantBeUsedMoreThanOne() throws Exception {
        Employee.Builder builder = new Employee.Builder();
        Employee fedor = builder.name("Fedor").build();
        Employee vasya = builder.bonus(1000).salary(2000).build();


    }
}





