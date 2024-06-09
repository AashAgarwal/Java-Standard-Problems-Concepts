import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        List<Integer> oddIndexedList = new ArrayList<>();
        for (int i = 1; i < list.size(); i += 2) {
            oddIndexedList.add(list.get(i));
        }
        Collections.reverse(oddIndexedList);
        for (int i : oddIndexedList) {
            System.out.print(i + " ");
        }
    }
}