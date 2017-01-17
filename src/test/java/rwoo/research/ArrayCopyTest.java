package rwoo.research;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ArrayCopyTest {
    @Test
    public void testArrayCopy() {
        List<String> listA = new ArrayList<String>();
        String[] tmpA = {"a", "b"};
        listA = Arrays.asList(tmpA);
        List<String> expextA = new ArrayList<String>();
        expextA.add("a");
        expextA.add("b");
        assertThat("listA is different", listA, is(expextA));

        List<String> listB = new ArrayList<String>();
        String[] tmpB = {"c", "d"};
        listB = Arrays.asList(tmpB);
        List<String> expextB = new ArrayList<String>();
        expextB.add("c");
        expextB.add("d");
        assertThat("listB is different", listB, is(expextB));

//        listA.addAll(listB); java.lang.UnsupportedOperationException

        List<String> listC = new ArrayList<String>();
        listC.addAll(listA);
        listC.addAll(listB);
        List<String> expextC = new ArrayList<String>();
        expextC.add("a");
        expextC.add("b");
        expextC.add("c");
        expextC.add("d");
        assertThat("listC is different", listC, is(expextC));

        List<String> listD = new ArrayList<String>();
        listD.add("a");
        listD.add("b");
        listD.addAll(listB);
        assertThat("listD is different", listD, is(expextC));
    }
}
