import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class MyQueue {
    Deque<Integer> queue = new ArrayDeque<>();

    public void enqueue(int num) {
        queue.addLast(num);
    }

    public int dequeue() {
        return queue.removeFirst();
    }

    public int peek() {
        return queue.getFirst();
    }
}

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            myQueue.enqueue(scanner.nextInt());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(myQueue.peek());
            System.out.println(myQueue.dequeue());
        }
    }
}