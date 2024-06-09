import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal bigDecimal1 = new BigDecimal(scanner.nextLine());
        BigDecimal bigDecimal2 = new BigDecimal(scanner.nextLine());
        BigDecimal bigDecimal3 = new BigDecimal(scanner.nextLine());
        System.out.println(bigDecimal1.add(bigDecimal2).add(bigDecimal3));
    }
}