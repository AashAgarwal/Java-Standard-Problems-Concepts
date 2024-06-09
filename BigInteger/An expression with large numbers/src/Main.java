import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger().negate();
        BigInteger b = scanner.nextBigInteger();
        BigInteger c = scanner.nextBigInteger();
        BigInteger d = scanner.nextBigInteger();
        System.out.println(a.multiply(b).add(c).subtract(d));
    }
}