package rwoo.research.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveKConsecutiveCharsTest {
    private RemoveKConsecutiveChars r = new RemoveKConsecutiveChars();

    // ref
    // https://www.careercup.com/question?id=5673460861763584
    // https://www.careercup.com/question?id=7449675
    // https://leetcode.com/problems/string-compression/

    @Test
    public void testRemoveChar() {
        assertEquals("aba", r.removeCharByRecursive("aba", 2));
        assertEquals("bc", r.removeCharByRecursive("baac", 2));
        assertEquals("abbbd", r.removeCharByRecursive("abbccccbaaaad", 4));
        assertEquals("", r.removeCharByRecursive("baabaa", 2));
    }

    @Test
    public void testRemoveCharByWhile() {
        assertEquals("aba", r.removeCharByWhile("aba", 2));
        assertEquals("bc", r.removeCharByWhile("baac", 2));
        assertEquals("abbbd", r.removeCharByWhile("abbccccbaaaad", 4));
        assertEquals("", r.removeCharByWhile("baabaa", 2));
    }

    @Test
    public void testRemoveCharByStack() {
        assertEquals("aba", r.removeCharByStack("aba", 2));
        assertEquals("bc", r.removeCharByStack("baac", 2));
        assertEquals("abbbd", r.removeCharByStack("abbccccbaaaad", 4));
        assertEquals("", r.removeCharByStack("baabaa", 2));
    }
}