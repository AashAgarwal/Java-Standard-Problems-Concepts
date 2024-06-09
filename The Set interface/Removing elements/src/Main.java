import java.util.*;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        // write your code here
        Set<Integer> set = new TreeSet<>();
        String[] strArray = str.split(" ");
        for (String s : strArray) {
            set.add(Integer.parseInt(s));
        }
        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        // write your code here
        SortedSet<Integer> sortedSet = new TreeSet<>(set);
        sortedSet = sortedSet.headSet(11);
        set.retainAll(sortedSet);
    }
}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}