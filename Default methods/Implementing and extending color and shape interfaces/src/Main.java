import java.util.Scanner;

// Both interfaces 'Shape' and 'Colorable' need to be declared here
// Remember to add the default methods 'name()' and 'color()'
interface Shape {

    default String name() {
        return "Generic Shape";
    }
}

interface Colorable {

    default String color() {
        return "No Color";
    }
}

// Implement the interfaces in the 'Circle' class here
// Make sure to override the 'name()' method
class Circle implements Shape, Colorable {

    @Override
    public String name() {
        return "Circle";
    }
}

// Create the 'ColoredCircle' class that extends 'Circle' and overrides 'color()'
class ColoredCircle extends Circle {

    @Override
    public String color() {
        return "Red";
    }
}


// Finally, create a method that takes the string input and returns the name and color of the respective object
public class Main {

    // Add your method here
    public static void method(String input) {
        if ("Circle".equals(input)) {
            Circle circle = new Circle();
            System.out.println(circle.name());
            System.out.println(circle.color());
        } else if ("ColoredCircle".equals(input)) {
            ColoredCircle coloredCircle = new ColoredCircle();
            System.out.println(coloredCircle.name());
            System.out.println(coloredCircle.color());
        } else {
            System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) {
        // Use this main method for testing your implementation
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        method(input);
    }
}