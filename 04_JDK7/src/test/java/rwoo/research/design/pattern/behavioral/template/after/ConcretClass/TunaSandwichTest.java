package rwoo.research.design.pattern.behavioral.template.after.ConcretClass;

import org.junit.Before;
import org.junit.Test;
import rwoo.research.design.pattern.behavioral.template.after.AbstractClass.Sandwich;

import static org.junit.Assert.*;

public class TunaSandwichTest {
    private Sandwich tunaSandwich;

    @Before
    public void setUp() throws Exception {
        tunaSandwich = new TunaSandwich();
    }

    @Test
    public void cook() throws Exception {
        tunaSandwich.printStatus();
        assertFalse(tunaSandwich.getStatus("bottom white bread"));
        assertFalse(tunaSandwich.getStatus("lettuce"));
        assertFalse(tunaSandwich.getStatus("tuna"));
        assertFalse(tunaSandwich.getStatus("tomato"));
        assertFalse(tunaSandwich.getStatus("top white bread"));
        tunaSandwich.cook();
        tunaSandwich.printStatus();
        assertTrue(tunaSandwich.getStatus("bottom white bread"));
        assertTrue(tunaSandwich.getStatus("lettuce"));
        assertTrue(tunaSandwich.getStatus("tuna"));
        assertTrue(tunaSandwich.getStatus("tomato"));
        assertTrue(tunaSandwich.getStatus("top white bread"));
    }
}