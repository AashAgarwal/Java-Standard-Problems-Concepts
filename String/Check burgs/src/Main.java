/**
 * Write a program that reads the name of a city and checks if the name ends with "burg".
 *
 * Keep in mind, a city can have a short name.
 *
 * The program should output true or false.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.nextLine();
        if (str.endsWith("burg")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}