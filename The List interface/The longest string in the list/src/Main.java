import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        // write your code here
        String longestString = "";
        int longestStrLength = 0;
        for (String string : list) {
            if (string.length() > longestStrLength) {
                longestStrLength = string.length();
                longestString = string;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i , longestString);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}