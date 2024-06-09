import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine().toLowerCase();
        String string2 = scanner.nextLine().toLowerCase();
        char[] charArray1 = string1.toCharArray();
        char[] charArray2 = string2.toCharArray();
        System.out.println(count(charArray1, charArray2));
    }

    public static int count(char[] charArray1, char[] charArray2) {
        SortedMap<Character, Integer> map1 = new TreeMap<>();
        SortedMap<Character, Integer> map2 = new TreeMap<>();
        for (char ch : charArray1) {
            if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);
            } else {
                map1.put(ch, 1);
            }
        }
        for (char ch : charArray2) {
            if (map2.containsKey(ch)) {
                map2.put(ch, map2.get(ch) + 1);
            } else {
                map2.put(ch, 1);
            }
        }
        int totalCount = 0;
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                totalCount += Math.abs(map2.get(entry.getKey()) - entry.getValue());
            } else {
                totalCount += entry.getValue();
            }
        }
        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            if (!map1.containsKey(entry.getKey())) {
                totalCount += entry.getValue();
            }
        }
        return totalCount;
    }
}