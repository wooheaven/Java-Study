package rwoo.research;


import org.apache.commons.lang3.ClassUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DoubleTest {
    private String myString;

    @Before
    public void setUp() {
        myString = "1";
    }

    @Test
    public void testParseDouble() throws NoSuchFieldException {
        double myDouble = Double.parseDouble(myString);
        assertEquals("double", ClassUtils.getShortClassName(double.class));
    }

    @Test
    public void testValueOf() {
        Double myDouble = Double.valueOf(myString);
        assertTrue(myDouble instanceof Double);
        assertEquals("Double", ClassUtils.getShortClassName(Double.class));
    }
}