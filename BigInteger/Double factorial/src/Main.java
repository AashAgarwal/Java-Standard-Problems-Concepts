import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        // type your java code here
        BigInteger fact = BigInteger.ONE;
        while (n > 0) {
            fact = fact.multiply(BigInteger.valueOf(n));
            n -= 2;
        }
        return fact;
    }
}