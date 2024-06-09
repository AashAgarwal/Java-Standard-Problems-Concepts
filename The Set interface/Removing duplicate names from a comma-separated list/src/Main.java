import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] names = input.split(",");

        Set<String> nameSet = new LinkedHashSet<>(List.of(names));
        StringBuilder stringBuilder = new StringBuilder();
        for (String name : nameSet) {
            stringBuilder.append(name).append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        System.out.println(stringBuilder);
    }
}