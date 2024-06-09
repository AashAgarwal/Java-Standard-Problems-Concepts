import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(stack.pop());
        }
    }
}