import java.util.ArrayList;
import java.util.LinkedList;

class ListOperations {
    public static void mergeLists(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        linkedList.addAll(arrayList);
        System.out.println("The new size of LinkedList is " + linkedList.size());
    }
}