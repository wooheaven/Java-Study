package rwoo.research.queue.me;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovingAverageTest {
    private MovingAverage m = new MovingAverage(3);
    private double delta = 0.1;

    @Test
    public void test_next() {
        assertEquals(1.0, m.next(1), delta);
        assertEquals(2.0, m.next(3), delta);
        assertEquals(3.0, m.next(5), delta);
        assertEquals(4.0, m.next(4), delta);
        assertEquals(5.0, m.next(6), delta);
    }
}
