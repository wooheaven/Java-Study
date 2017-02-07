package rwoo.research;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CollectionTest {
    private List<String> actualList = new ArrayList<String>();
    private List<String> expectList = new ArrayList<String>();

    @Before
    public void setUp() {
        actualList.add("John");
        actualList.add("Lennon");
        actualList.add("John");
        actualList.add("RiverBell");

        expectList.add("John");
        expectList.add("John");
        expectList.add("Lennon");
        expectList.add("RiverBell");
    }

    @Test
    public void testCollectionSortWithAnonymousClass() {
        Collections.sort(actualList, new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    String str1 = (String) o1;
                    String str2 = (String) o2;
                    return str1.compareTo(str2);
                }
                return 0;
            }
        });

        assertThat("Sort is not corrected", actualList, is(expectList));
    }
}
