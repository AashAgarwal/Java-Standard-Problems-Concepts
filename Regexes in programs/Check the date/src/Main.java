import java.util.*;

class Date {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String date = scn.nextLine();
        String dateRegex = "(19[0-9]{2}|20[0-9]{2})[-/.](0[1-9]|1[0-2])[-/.]([0-2][0-9]|3[0-1])";
        String dateRegex2 = "([0-2][0-9]|3[0-1])[-/.](0[1-9]|1[0-2])[-/.](19[0-9]{2}|20[0-9]{2})";
        if (date.matches(dateRegex) || date.matches(dateRegex2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}