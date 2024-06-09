import java.util.Scanner;

interface Greetings {
    default String greet(String name) {
        return "Hello, " + name + "!";
    }
}

class GreetingsImpl implements Greetings {
    @Override
    public String greet(String name) {
        return Greetings.super.greet(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Greetings greetings = new GreetingsImpl();
        String greeting = greetings.greet(name);
        System.out.println(greeting);
    }
}