package rwoo.research.stack;

import java.util.Stack;

public class PairRoundBracket {
    private static final String pair = "()";
    private static final Character open = '(';
    private static final Character close = ')';

    public static boolean isPairByWhile(String input) {
        int at = 0;
        while (-1 < at) {
            at = input.indexOf(pair);
            if (-1 < at) {
                input = input.substring(0, at) + input.substring(at + 2);
            }
        }
        return input.isEmpty();
    }

    public static boolean isPairByRecursive(String input) {
        int at = input.indexOf(pair);
        if (-1 == at) {
            return false;
        } else {
            input = input.substring(0, at) + input.substring(at + 2);
            if (input.isEmpty()) {
                return true;
            } else {
                return isPairByRecursive(input);
            }
        }
    }

    public static boolean isPairByStack(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (open == current) {
                stack.push(current);
            } else if (close == current) {
                if (stack.isEmpty()) {
                    return false;
                }
                if (open == stack.peek()) {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
