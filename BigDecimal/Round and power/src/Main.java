import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int scale = Integer.parseInt(scanner.nextLine());
        BigDecimal number = new BigDecimal(scanner.nextLine());
        BigDecimal result = number.setScale(scale, RoundingMode.FLOOR);
        result = result.pow(power);
        System.out.println(result);
    }
}