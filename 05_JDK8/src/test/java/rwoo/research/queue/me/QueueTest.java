package rwoo.research.queue.me;

import java.util.LinkedList;
import java.util.Queue;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    // 1. Initialize a queue.
    private Queue<Integer> q = new LinkedList<Integer>();

    @Test
    public void test_queue() {
        // 2. Get the first element - return null if queue is empty.
        assertNull(q.peek());

        // 3. Push new element.
        assertTrue(q.offer(0));
        assertTrue(q.offer(1));
        assertTrue(q.offer(2));

        // 4. Pop an element.
        assertEquals(new Integer(0), q.peek());
        assertEquals(new Integer(0), q.poll());
        assertEquals(new Integer(1), q.peek());

        // 5. Check the size of the queue.
        assertEquals(2, q.size());
    }
}
