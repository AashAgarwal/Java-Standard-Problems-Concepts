import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal bigDecimal1 = new BigDecimal(scanner.nextLine());
        BigDecimal bigDecimal2 = new BigDecimal(scanner.nextLine());
        BigDecimal bigDecimal3 = new BigDecimal(scanner.nextLine());
        BigDecimal average = bigDecimal1.add(bigDecimal2).add(bigDecimal3);
        average = average.divide(BigDecimal.valueOf(3), 0, RoundingMode.DOWN);
        System.out.println(average);
    }
}