import java.util.Scanner;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new PriorityQueue<>(new IntegerComparator());

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            int finalI = i;
            if (IntStream.range(2, i).noneMatch(x -> finalI % x == 0)) {
                queue.add(i);
            }
        }

        if (queue.size() > 2) {
            System.out.println(queue.poll());
            System.out.println(queue.poll());
            System.out.println(queue.poll());
        } else if (queue.size() == 2) {
            System.out.printf("There aren't enough elements in a queue. You added two: %d and %d.",
                    queue.poll(), queue.poll());
        } else if (queue.size() == 1) {
            System.out.printf("There aren't enough elements in a queue. You added only %d.", queue.poll());
        } else {
            System.out.println("The queue is empty.");
        }
    }
}

class IntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return Integer.compare(i2, i1);
    }
}