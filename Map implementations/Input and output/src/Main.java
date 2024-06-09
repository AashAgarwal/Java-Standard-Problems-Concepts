import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int fromRange = scanner.nextInt();
        int toRange = scanner.nextInt();
        int numberOfInputs = scanner.nextInt();
        SortedMap<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < numberOfInputs; i++) {
            map.put(scanner.nextInt(), scanner.next());
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() >= fromRange && entry.getKey() <= toRange) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}