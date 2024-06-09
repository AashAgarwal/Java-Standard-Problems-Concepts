import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            numbers.add(i);
        }

        if (numbers.size() % 2 == 0) {
            int middle = (numbers.get(numbers.size() / 2) + numbers.get(numbers.size() / 2 - 1)) / 2;
            System.out.println(middle);
        } else {
            System.out.println(numbers.get(numbers.size() / 2));
        }

    }
}