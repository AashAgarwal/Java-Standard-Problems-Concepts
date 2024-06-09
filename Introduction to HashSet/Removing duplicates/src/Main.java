import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.asList(scanner.nextLine(), scanner.nextLine());

        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }
}