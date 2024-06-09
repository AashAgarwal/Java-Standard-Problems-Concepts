import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine().replaceAll("\\s+", "");
        scanner.close();
        String upperRegex = "[A-Z]";
        String lowerRegex = "[a-z]";
        String digitRegex = "[0-9]";

        if (password.length() >= 12 &&
                password.matches(".*" + upperRegex + ".*") &&
                password.matches(".*" + lowerRegex + ".*") &&
                password.matches(".*" + digitRegex + ".*")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}