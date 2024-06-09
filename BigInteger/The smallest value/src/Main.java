import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        BigInteger number = new BigInteger(String.valueOf(scanner.nextBigInteger()));
        long n = 1;
        BigInteger product = BigInteger.ONE;
        while (product.compareTo(number) < 0) {
            n++;
            product = product.multiply(BigInteger.valueOf(n));
        }
        System.out.println(n);
    }
}