import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("password[\\s:]*[a-zA-Z0-9]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        if (!text.toLowerCase().contains("password")) {
            System.out.println("No passwords found.");
        } else {
            while (matcher.find()) {
                String[] words = matcher.group().split("[\\s:]+");
                System.out.println(words[words.length - 1]);
            }
        }
    }
}