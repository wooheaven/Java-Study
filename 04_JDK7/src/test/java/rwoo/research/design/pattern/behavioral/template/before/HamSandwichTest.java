package rwoo.research.design.pattern.behavioral.template.before;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HamSandwichTest {
    private HamSandwich hamSandwich;

    @Before
    public void setUp() throws Exception {
        hamSandwich = new HamSandwich();
    }

    @Test
    public void testCook() throws Exception {
        hamSandwich.printStatus();
        assertFalse(hamSandwich.getStatus("bottom white bread"));
        assertFalse(hamSandwich.getStatus("lettuce"));
        assertFalse(hamSandwich.getStatus("ham"));
        assertFalse(hamSandwich.getStatus("top white bread"));
        hamSandwich.cook();
        hamSandwich.printStatus();
        assertTrue(hamSandwich.getStatus("bottom white bread"));
        assertTrue(hamSandwich.getStatus("lettuce"));
        assertTrue(hamSandwich.getStatus("ham"));
        assertTrue(hamSandwich.getStatus("top white bread"));
    }
}