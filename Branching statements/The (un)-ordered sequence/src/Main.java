import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isSequence = true;
        boolean flag = true;
        List<Integer> list = new ArrayList<>();

        while (scanner.hasNext() && flag) {
            int num = scanner.nextInt();
            if (num == 0) {
                flag = false;
                break;
            }
            list.add(num);
        }

        for (int i = 0; i < list.size() - 2; i++) {
            if ((list.get(i) < list.get(i + 1) && list.get(i + 1) > list.get(i + 2)) || (list.get(i) > list.get(i + 1) && list.get(i + 1) < list.get(i + 2))) {
                isSequence = false;
            }
        }
        System.out.println(isSequence);
    }
}