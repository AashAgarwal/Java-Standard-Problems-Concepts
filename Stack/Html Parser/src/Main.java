import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void parser(String input) {
        Pattern pattern = Pattern.compile("<([a-z\\d]+)>(.+)</\\1>");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            parser(matcher.group(2));
            System.out.println(matcher.group(2));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        parser(scanner.nextLine());
    }
}