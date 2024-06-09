import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first name
        String firstName = scanner.nextLine();

        // Read the last name
        String lastName = scanner.nextLine();

        // Read the age as an integer
        int age = scanner.nextInt();

        // Print the greeting message
        System.out.printf("Hello, %s%s %s%s. You are %d years old.",
                firstName.substring(0, 1).toUpperCase(), firstName.substring(1),
                lastName.substring(0, 1).toUpperCase(), lastName.substring(1), age);
    }
}