import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class FindTheKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("[b-df-hj-np-tw-z0-9]+|[aeiou?!#]+", Pattern.CASE_INSENSITIVE);
        String[] words = text.split("\\s+");

        for (String word : words) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.matches()) {
                System.out.println(matcher.group());
            }
        }
    }
}