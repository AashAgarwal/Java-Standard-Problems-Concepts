import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String[] elements = scanner.nextLine().split(" ");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String element : elements) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}