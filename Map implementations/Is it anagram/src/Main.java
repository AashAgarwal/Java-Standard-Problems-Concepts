import java.util.Objects;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine().toLowerCase();
        String str2 = scanner.nextLine().toLowerCase();
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        boolean anagram = isAnagrams(array1, array2);
        if (anagram) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean isAnagrams(char[] array1, char[] array2) {
        SortedMap<Character, Integer> map1 = new TreeMap<>();
        SortedMap<Character, Integer> map2 = new TreeMap<>();
        for (char ch : array1) {
            if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);
            } else {
                map1.put(ch, 1);
            }
        }
        for (char ch : array2) {
            if (map2.containsKey(ch)) {
                map2.put(ch, map2.get(ch) + 1);
            } else {
                map2.put(ch, 1);
            }
        }
        return Objects.deepEquals(map1, map2);
    }
}