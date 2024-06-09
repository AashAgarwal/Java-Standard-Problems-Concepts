import java.util.Scanner;
import java.util.Stack;

class BaseballGameScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] operations = input.split(" ");
        System.out.println(calculateScore(operations));
    }

    public static int calculateScore(String[] op) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (String c : op) {
            switch (c) {
                case "+" -> {
                    int temp1 = stack.pop();
                    int temp2 = stack.peek();
                    stack.push(temp1);
                    stack.push(temp1 + temp2);
                }
                case "D" -> stack.push(stack.peek() * 2);
                case "C" -> stack.pop();
                default -> stack.push(Integer.parseInt(c));
            }
        }
        for (int i : stack) {
            sum += i;
        }
        return sum;
    }
}