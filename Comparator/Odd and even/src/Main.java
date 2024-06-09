import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Utils {

    public static List<Integer> sortOddEven(List<Integer> numbers) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (int i : numbers) {
            if (i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }

        Collections.sort(oddList);
        evenList.sort(Collections.reverseOrder());
        List<Integer> sortedList = new ArrayList<>();
        sortedList.addAll(oddList);
        sortedList.addAll(evenList);
        return sortedList;
    }
}