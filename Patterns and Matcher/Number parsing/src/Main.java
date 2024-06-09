import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "[+-]?\\d|[+-]?[1-9]\\d*|[+-]?\\d+[.,]\\d+[1-9]+|[+-]?\\d+[.,]\\d";

        String number = scanner.nextLine();
        System.out.println(number.matches(regex) ? "YES" : "NO");
    }
}