import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Write your code here.
        List<Integer> list = new ArrayList<>();
        list = convertToList(number);
        System.out.println(list);
    }

    public static List<Integer> convertToList(int number){
        // Write your code here.
        String num = String.valueOf(number);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num.length(); i++) {
            list.add(Integer.parseInt(String.valueOf(num.charAt(i))));
        }
        Collections.sort(list);
        return list;
    }
}