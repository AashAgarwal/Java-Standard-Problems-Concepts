import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal startingMoney = new BigDecimal(scanner.nextLine());
        BigDecimal interestRate = new BigDecimal(scanner.nextLine());
        int years = scanner.nextInt();
        BigDecimal finalAmount = startingMoney.multiply(BigDecimal.ONE.add(
                interestRate.divide(new BigDecimal("100"))).pow(years));
        finalAmount = finalAmount.setScale(2, RoundingMode.CEILING);
        System.out.println("Amount of money in the account: " + finalAmount);
    }
}