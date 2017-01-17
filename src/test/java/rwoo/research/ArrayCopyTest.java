package rwoo.research;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ArrayCopyTest {
    @Test
    public void testArrayCopy() {
        List<String> listA = new ArrayList<String>();
        String[] tmpA = {"a", "b", "c"};
        listA = Arrays.asList(tmpA);
        List<String> expextA = new ArrayList<String>();
        expextA.add("a");
        expextA.add("b");
        expextA.add("c");
        assertThat("listA is different", listA, is(expextA));
    }
}
