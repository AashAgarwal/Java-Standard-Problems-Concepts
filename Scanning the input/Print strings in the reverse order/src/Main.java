//put imports you need here

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        while(scanner.hasNext()) {
            stringList.add(scanner.next());
        }
        for (int i = stringList.size() - 1; i >= 0; i--) {
            System.out.println(stringList.get(i));
        }
    }
}