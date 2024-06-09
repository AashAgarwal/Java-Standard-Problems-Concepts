import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ipAddress = scanner.nextLine().replaceAll("\\s+", "");

        String pattern = "((\\d)|([1-9]\\d)|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))";

        String regex = String.join("\\.", pattern, pattern, pattern, pattern);

        if (ipAddress.matches(regex)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}