import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine().replaceAll("[^a-zA-Z\\s]", " ");
        String[] words = line.split("\\s+");
        boolean find = false;
        String regex = "^" + part + "|" + part + "$";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        for (String word : words) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                find = true;
            }
        }
        System.out.println(find ? "YES" : "NO");
    }
}