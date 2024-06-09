import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Function<Integer, String> isDivisibleBy3And5 = x -> x % 3 == 0 && x % 5 == 0 ? "true" : "false";

        System.out.println(isDivisibleBy3And5.apply(n));
    }
}