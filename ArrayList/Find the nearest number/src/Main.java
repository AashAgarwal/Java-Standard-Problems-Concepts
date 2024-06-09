import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArray = str.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String string: strArray) {
            list.add(Integer.parseInt(string));
        }
        int n = scanner.nextInt();
        closestInteger(list, n);
    }

    public static void closestInteger(List<Integer> list, int n) {
        Collections.sort(list);
        List<Integer> closest = new ArrayList<>();
        int minimumDistance = Math.abs(n - list.get(0));
        for (int i = 1; i < list.size(); i++) {
            if (Math.abs(n - list.get(i)) < minimumDistance) {
                minimumDistance = Math.abs(n - list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (Math.abs(list.get(i) - n) == minimumDistance) {
                closest.add(list.get(i));
            }
        }
        for (int i : closest) {
            System.out.print(i + " ");
        }
    }
}