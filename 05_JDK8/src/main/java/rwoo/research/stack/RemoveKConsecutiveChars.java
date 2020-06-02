package rwoo.research.stack;

import java.util.Stack;

public class RemoveKConsecutiveChars {

    public static String removeCharByWhile(String input, int k) {
        int at = 0;
        while (-1 < at) {
            at = indexOf(input, at, k);
            if (-1 < at) {
                input = input.substring(0, at) + input.substring(at + k);
                at = (at == 0) ? 0 : at - 1;
            }
        }
        return input;
    }

    private static int indexOf(String input, int at, int k) {
        int result = -1;
        for (int i = at; i + k - 1 < input.length(); i++) {
            char currentChar = input.charAt(i);
            String search = "" + currentChar;
            for (int j = 1; j < k; j++) {
                search += currentChar;
            }
            int currentIndex = input.indexOf(search);
            if (-1 < currentIndex & i == currentIndex) {
                result = currentIndex;
                break;
            }
        }
        return result;
    }

    public static String removeCharByRecursive(String input, int k) {
        return removeCharByRecursive(input, k, 0);
    }

    private static String removeCharByRecursive(String input, int k, int start) {
        for (int i = start; i + k - 1 < input.length(); i++) {
            String search = "" + input.charAt(i);
            for (int j = 0; j < k - 1; j++) {
                search += input.charAt(i);
            }
            int at = input.indexOf(search);
            if (i == at) {
                input = input.replaceFirst(search, "");
                input = removeCharByRecursive(input, k, (i > 0) ? i - 1 : 0);
            }
        }
        return input;
    }

    public static String removeCharByStack(String input, int k) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (stack.isEmpty()) {
                stack.push(current);
            } else if (stack.peek() != current) {
                stack.removeAllElements();
                stack.push(current);
            } else {
                stack.push(current);
                if (k == stack.size()) {
                    input = input.substring(0, i - k + 1) + input.substring(i + 1);
                    input = removeCharByStack(input, k);
                }
            }
        }
        return input;
    }
}
