import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] str1 = scanner.nextLine().split(" ");
        String[] str2 = scanner.nextLine().split(" ");
        boolean contains = subset(str1, str2);
        if (contains) {
            System.out.println("You get money");
        } else {
            System.out.println("You are busted");
        }
    }

    public static boolean subset(String[] str1, String[] str2) {
        SortedMap<String, Integer> map1 = new TreeMap<>();
        SortedMap<String, Integer> map2 = new TreeMap<>();
        for (String str : str1) {
            if (map1.containsKey(str)) {
                map1.put(str, map1.get(str) + 1);
            } else {
                map1.put(str, 1);
            }
        }
        for (String str : str2) {
            if (map2.containsKey(str)) {
                map2.put(str, map2.get(str) + 1);
            } else {
                map2.put(str, 1);
            }
        }
        boolean contains = false;
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            if (map1.containsKey(entry.getKey()) && map1.get(entry.getKey()) >= entry.getValue()) {
                contains = true;
            } else {
                contains = false;
                break;
            }
        }
        return contains;
    }
}