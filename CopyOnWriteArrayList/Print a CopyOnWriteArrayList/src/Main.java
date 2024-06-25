import java.util.concurrent.CopyOnWriteArrayList;

class PrintElementsClass {

    public static void printElements(CopyOnWriteArrayList<String> onWriteArrayList, String elementToAdd) {
        onWriteArrayList.add(elementToAdd);
        for (String string : onWriteArrayList) {
            System.out.print(string + " ");
        }
    }
}