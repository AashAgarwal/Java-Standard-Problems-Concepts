import java.util.Scanner;

// Create a generic class to hold an object of any type
class GenericClass<T> {
    // TODO: Declare a private member variable to store the generic object
    private T variable;

    // TODO: Create a constructor to initialize the generic object
    GenericClass(T variable) {
        this.variable = variable;
    }

    // TODO: Implement a generic method to print the string representation of the object
    void printVariable() {
        System.out.println("String representation: " + variable.toString());
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String var1 = scanner.nextLine();
        int var2 = scanner.nextInt();

        // TODO: Create an instance of the generic class with a String object
        GenericClass<String> string = new GenericClass<>(var1);

        // TODO: Create an instance of the generic class with an Integer object
        GenericClass<Integer> integer = new GenericClass<>(var2);

        // TODO: Call the generic method with the String object
        string.printVariable();

        // TODO: Call the generic method with the Integer object
        integer.printVariable();
    }
}