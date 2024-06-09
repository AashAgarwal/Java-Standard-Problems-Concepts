import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static boolean isBalanced(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        final char openParenthesis = '(';
        final char closeParenthesis = ')';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == openParenthesis) {
                // Push an open parenthesis onto the stack
                stack.push(ch);
            } else if (ch == closeParenthesis) {
                // If the stack is empty or the top element is not an open parenthesis, the string is not balanced
                if (stack.isEmpty() || !stack.peek().equals(openParenthesis)) {
                    return false;
                }
                stack.pop();
            }
        }

        // If the stack is not empty after processing the string, the string is not balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seq = scanner.next();
        System.out.println(isBalanced(seq));
    }
}