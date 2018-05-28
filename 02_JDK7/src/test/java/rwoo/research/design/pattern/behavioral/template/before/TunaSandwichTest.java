package rwoo.research.design.pattern.behavioral.template.before;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TunaSandwichTest {
    private TunaSandwich tunaSandwich;

    @Before
    public void setUp() throws Exception {
        tunaSandwich = new TunaSandwich();
    }

    @Test
    public void testCook() throws Exception {
        tunaSandwich.printStatus();
        assertFalse(tunaSandwich.getStatus("bottom white bread"));
        assertFalse(tunaSandwich.getStatus("lettuce"));
        assertFalse(tunaSandwich.getStatus("tuna"));
        assertFalse(tunaSandwich.getStatus("top white bread"));
        tunaSandwich.cook();
        tunaSandwich.printStatus();
        assertTrue(tunaSandwich.getStatus("bottom white bread"));
        assertTrue(tunaSandwich.getStatus("lettuce"));
        assertTrue(tunaSandwich.getStatus("tuna"));
        assertTrue(tunaSandwich.getStatus("top white bread"));
    }
}