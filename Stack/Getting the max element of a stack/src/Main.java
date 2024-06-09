import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        maxStack.push(Integer.MIN_VALUE);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            if ("push".equals(input)) {
                int value = scanner.nextInt();
                stack.push(value);
                if (maxStack.peek() <= value) {
                    maxStack.push(value);
                }
            }
            if ("pop".equals(input)) {
                if (Objects.equals(maxStack.peek(), stack.peek())) {
                    maxStack.pop();
                }
                stack.pop();
            }
            if ("max".equals(input)) {
                System.out.println(maxStack.peek());
            }
        }
    }
}