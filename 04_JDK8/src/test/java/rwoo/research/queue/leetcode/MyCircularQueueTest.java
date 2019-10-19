package rwoo.research.queue.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyCircularQueueTest {
    private MyCircularQueue obj;

    @Test
    public void test_1st() {
        obj = new MyCircularQueue(3);
        assertTrue(obj.enQueue(1));
        assertTrue(obj.enQueue(2));
        assertTrue(obj.enQueue(3));
        assertFalse(obj.enQueue(4));
        assertEquals(3, obj.Rear());
        assertTrue(obj.isFull());
        assertTrue(obj.deQueue());
        assertTrue(obj.enQueue(4));
        assertEquals(4, obj.Rear());
    }

    @Test
    public void test_2nd() {
        obj = new MyCircularQueue(6);
        assertTrue(obj.enQueue(6));
        assertEquals(6, obj.Rear());
        assertEquals(6, obj.Rear());
        assertTrue(obj.deQueue());
        assertTrue(obj.enQueue(5));
        assertEquals(5, obj.Rear());
        assertTrue(obj.deQueue());
        assertEquals(-1, obj.Front());
        assertFalse(obj.deQueue());
        assertFalse(obj.deQueue());
        assertFalse(obj.deQueue());
    }

    @Test
    public void test_3rd() {
        obj = new MyCircularQueue(2);
        assertTrue(obj.enQueue(10));
        assertTrue(obj.enQueue(20));
        assertTrue(obj.deQueue());
        assertTrue(obj.deQueue());
        assertEquals(-1, obj.Front());
        assertEquals(-1, obj.Rear());
        assertTrue(obj.enQueue(30));
        assertEquals(30, obj.Front());
        assertEquals(30, obj.Rear());
    }

    @Test
    public void test_4th() {
        obj = new MyCircularQueue(2);
        assertEquals(-1, obj.Front());
        assertEquals(-1, obj.Rear());
    }
}
