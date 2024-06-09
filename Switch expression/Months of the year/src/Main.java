/**
 * Write a program that reads the number of the month (1-6) and outputs the name. Please use the switch expression in
 * this task.
 * If a number does not belong to any of the listed months, the program should output error!.
 */

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        String month = switch (number) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            default -> throw new IllegalStateException("error!");
        };
        System.out.println(month);
    }
}