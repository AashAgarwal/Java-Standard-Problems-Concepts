import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine().replaceAll("[^a-zA-Z,\\s]", "");
        String[] words = line.split("[,\\s]+");
        boolean found = false;

        for (String word : words) {
            word = word.replaceAll(",", "");
            if (word.length() == size) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "YES" : "NO");
    }
}