import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static String replace(String input) {
        Pattern pattern = Pattern.compile("lion");
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("guinea pig");
    }    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(replace(line)); 
    }
}