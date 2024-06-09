import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();
        String[] words = line.split("\\s+");
        boolean matchFoundInBetween = false;

        Pattern pattern = Pattern.compile(part, Pattern.CASE_INSENSITIVE);
        Pattern newpattern = Pattern.compile("^" + part + "|" + part + "$", Pattern.CASE_INSENSITIVE);

        for (String word : words) {
            Matcher matcher = pattern.matcher(word);
            Matcher newmatcher = newpattern.matcher(word);
            if (matcher.find() && !newmatcher.find()) {
                matchFoundInBetween = true;
            }
        }

        System.out.println(matchFoundInBetween ? "YES" : "NO");
    }
}