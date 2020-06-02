package rwoo.research.sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    private BinarySearch b;
    private int[] input;

    @Before
    public void setUp() throws Exception {
        b = new BinarySearch();
        input = new int[]{1, 2, 4, 5, 6, 8, 9, 10, 13, 17, 22};
    }

    @Test
    public void test_Custom_BinarySearch() {
        assertEquals(-1, b.search(input, 3));
        assertEquals(2, b.search(input, 4));
        assertEquals(3, b.search(input, 5));
        assertEquals(8, b.search(input, 13));
    }

    @Test
    public void test_Arrays_binarySearch() {
        assertEquals(-1, (Arrays.binarySearch(input, 3) > 0) ? Arrays.binarySearch(input, 3) : -1 );
        assertEquals(2, Arrays.binarySearch(input, 4));
        assertEquals(3, Arrays.binarySearch(input, 5));
        assertEquals(8, Arrays.binarySearch(input, 13));
    }

    @Test
    public void test_findRootSquareBS() {
        assertEquals(2, b.findRootSquareBS(4));
        assertEquals(3, b.findRootSquareBS(9));
        assertEquals(9, b.findRootSquareBS(81));
    }

    @Test
    public void test_findRootSquareWhile() {
        assertEquals(2, b.findRootSquareWhile(4));
        assertEquals(3, b.findRootSquareWhile(9));
        assertEquals(9, b.findRootSquareWhile(81));
    }
}