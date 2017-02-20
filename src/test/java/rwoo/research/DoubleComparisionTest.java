package rwoo.research;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DoubleComparisionTest {
    private DoubleComparision dc = new DoubleComparision();
    private double deltaA;
    private double deltaB;

    @Before
    public void setUp() {
        deltaA = dc.findDelta(0.1 * 0.1, 0.01);
        deltaB = dc.findDelta(0.2 * 0.2, 0.04);
    }

    @Test
    public void testDoubleDefaultEquals() {
        System.out.println("0.1 * 0.1 - 0.01 = 0.0 = " + deltaA);
        assertFalse("Floating-point error should be happen.", deltaA == 0.0);

        System.out.println("0.2 * 0.2 - 0.04 = 0.0 = " + deltaB);
        assertFalse("Floating-point error should be happen.", deltaB == 0.0);
    }

    @Test
    public void testDefinedEquals() {
        assertFalse(dc.isEqauls(1.0, 1.000000000000005));
        assertTrue(dc.isEqauls(1.0, 1.0000000000000005));

        assertTrue("0.0 must be 0.0", dc.isEqauls(0.0, 0.0));
        assertTrue("deltaA isRelativelyEqual 0.0", dc.isEqauls(deltaA, 0.0));
        assertTrue("deltaB isRelativelyEqual 0.0", dc.isEqauls(deltaB, 0.0));
        assertTrue("deltaA isRelativelyEqual deltaB", dc.isEqauls(deltaA, deltaB));
    }
}
