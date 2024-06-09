import java.util.ArrayList;
import java.util.LinkedList;

class ListOperations {
    public static void changeHeadsAndTails(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        String tempFirst = linkedList.get(0);
        String tempLast = linkedList.get(linkedList.size() - 1);
        linkedList.set(0, arrayList.get(0));
        linkedList.set(linkedList.size() - 1, arrayList.get(arrayList.size() - 1));
        arrayList.set(0, tempFirst);
        arrayList.set(arrayList.size() - 1, tempLast);
    }
}