import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyM = scanner.nextDouble();
        double depositPercentP = scanner.nextDouble();
        double maxDepositK = scanner.nextDouble();
        int yearCount = 0;
        double sum = moneyM;

        while (sum < maxDepositK) {
            sum = sum + (sum * depositPercentP / 100);
            yearCount++;
        }
        System.out.println(yearCount);
    }
}