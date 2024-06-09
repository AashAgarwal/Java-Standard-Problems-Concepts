import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] string = str.split(" ");
        List<String> list = new ArrayList<>(List.of(string));
        System.out.print(list);
    }
}