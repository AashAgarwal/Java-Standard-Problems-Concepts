import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeanutButterCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        System.out.println(!isWeekend && (numberOfPeanutButterCups >= 10 && numberOfPeanutButterCups <= 20) || isWeekend && (numberOfPeanutButterCups >= 15 && numberOfPeanutButterCups <= 25));
    }
}