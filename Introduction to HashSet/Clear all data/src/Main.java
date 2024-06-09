import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = createSet(scanner);
        testSet(set);
    }

    private static void clearSet(Set<String> set) {
        set.clear();
    }

    private static Set<String> createSet(Scanner scanner) {
        Set<String> set = new HashSet<>();
        set.add(scanner.nextLine());
        set.add(scanner.nextLine());
        set.add(scanner.nextLine());

        return set;
    }

    private static void testSet(Set<String> set) {
        clearSet(set);
        if (set.isEmpty()) {
            System.out.print("The set is empty!");
        } else {
            System.out.println("Error");
        }
    }
}