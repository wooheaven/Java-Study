package rwoo.research.design.pattern.behavioral.template.brutal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BaconSandwichTest {
    private BaconSandwich baconSandwich;

    @Before
    public void setUp() throws Exception {
        baconSandwich = new BaconSandwich();
    }

    @Test
    public void cook() throws Exception {
        baconSandwich.printStatus();
        assertFalse(baconSandwich.getStatus("bottom white bread"));
        assertFalse(baconSandwich.getStatus("lettuce"));
        assertFalse(baconSandwich.getStatus("bacon"));
        assertFalse(baconSandwich.getStatus("tomato"));
        assertFalse(baconSandwich.getStatus("top white bread"));
        baconSandwich.cook();
        baconSandwich.printStatus();
        assertTrue(baconSandwich.getStatus("bottom white bread"));
        assertTrue(baconSandwich.getStatus("lettuce"));
        assertTrue(baconSandwich.getStatus("bacon"));
        assertTrue(baconSandwich.getStatus("tomato"));
        assertTrue(baconSandwich.getStatus("top white bread"));
    }
}