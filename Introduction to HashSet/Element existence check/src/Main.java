import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = createSet(scanner);
        String value = scanner.nextLine();
        if (set.contains(value)) {
            System.out.println("The element exists!");
        } else {
            System.out.println("The element doesn't exist!");
        }
    }

    private static Set<String> createSet(Scanner scanner) {
        Set<String> set = new HashSet();
        set.add(scanner.nextLine());
        set.add(scanner.nextLine());
        set.add(scanner.nextLine());

        return set;
    }
}