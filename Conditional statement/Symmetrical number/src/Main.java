import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int thousandthDigit = number / 1000;
        int hundredthDigit = (number / 100) % 10;
        int tenthDigit = ((number / 10) % 100) % 10;
        int onesDigit = (number % 1000) % 10;

        if (thousandthDigit == onesDigit && hundredthDigit == tenthDigit) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}