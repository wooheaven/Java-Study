package rwoo.research.design.pattern.behavioral.template.after.ConcretClass;

import org.junit.Before;
import org.junit.Test;
import rwoo.research.design.pattern.behavioral.template.after.AbstractClass.Sandwich;

import static org.junit.Assert.*;

public class HamSandwichTest {
    private Sandwich hamSandwich;

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
        assertFalse(hamSandwich.getStatus("tomato"));
        assertFalse(hamSandwich.getStatus("top white bread"));
        hamSandwich.cook();
        hamSandwich.printStatus();
        assertTrue(hamSandwich.getStatus("bottom white bread"));
        assertTrue(hamSandwich.getStatus("lettuce"));
        assertTrue(hamSandwich.getStatus("ham"));
        assertTrue(hamSandwich.getStatus("tomato"));
        assertTrue(hamSandwich.getStatus("top white bread"));
    }
}