import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        Set<String> setOfWords = new HashSet<>();
        for (int i = 0; i < d; i++) {
            setOfWords.add(scanner.next().toLowerCase().trim());
        }
        int n = scanner.nextInt();
        scanner.nextLine();
        Set<String> dictionary = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] strArray = scanner.nextLine().toLowerCase().split(" ");
            dictionary.addAll(Arrays.asList(strArray));
        }
        dictionary.removeAll(setOfWords);
        for (String str: dictionary) {
            System.out.println(str);
        }
    }
}