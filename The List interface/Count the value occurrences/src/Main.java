import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method
        int elemInList1Count = 0;
        int elemInList2Count = 0;
        for (int i : list1) {
            if (i == elem) {
                elemInList1Count++;
            }
        }
        for (int i : list2) {
            if (i == elem) {
                elemInList2Count++;
            }
        }
        return elemInList1Count == elemInList2Count;
    }
}