package tdd;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by Jeka on 23/08/2016.
 */
public class TaxCalculatorTest {
    @Test
    public void afterNDS() throws Exception {
        TaxCalculator taxCalculator = new TaxCalculator();
        NDSResolver mockNdsResolver = mock(NDSResolver.class);
        when(mockNdsResolver.getNDS()).thenReturn(0.10);
        taxCalculator.setNdsResolver(mockNdsResolver);
        double afterNDS = taxCalculator.afterNDS(100);
        Assert.assertEquals(110,afterNDS,0.00001);
    }

}