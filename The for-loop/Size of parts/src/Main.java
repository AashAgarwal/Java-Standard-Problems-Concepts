import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int perfect = 0;
        int larger = 0;
        int smaller = 0;

        for (int i = 0; i < input; i++) {
            int code = scanner.nextInt();
            if (code == 0) {
                perfect += 1;
            } else if (code == 1) {
                larger += 1;
            } else if (code == -1) {
                smaller += 1;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}