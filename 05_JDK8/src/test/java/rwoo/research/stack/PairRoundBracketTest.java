package rwoo.research.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PairRoundBracketTest {
    private PairRoundBracket p = new PairRoundBracket();

    // ref
    // https://www.hackerrank.com/challenges/balanced-brackets/problem

    @Test
    public void testIsPairByWhile() {
        assertEquals(true, p.isPairByWhile("()"));
        assertEquals(false, p.isPairByWhile(")("));
        assertEquals(true, p.isPairByWhile("(())"));
        assertEquals(false, p.isPairByWhile("((()"));
        assertEquals(true, p.isPairByWhile("()()"));
    }

    @Test
    public void testIsPairByRecursive() {
        assertEquals(true, p.isPairByRecursive("()"));
        assertEquals(false, p.isPairByRecursive(")("));
        assertEquals(true, p.isPairByRecursive("(())"));
        assertEquals(false, p.isPairByRecursive("((()"));
        assertEquals(true, p.isPairByRecursive("()()"));
    }

    @Test
    public void testIsPairByStack() {
        assertEquals(true, p.isPairByStack("()"));
        assertEquals(false, p.isPairByStack(")("));
        assertEquals(true, p.isPairByStack("(())"));
        assertEquals(false, p.isPairByStack("((()"));
        assertEquals(true, p.isPairByStack("()()"));
    }
}