import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void printMostFrequentWords(List<String> words) {
        Map<String, Integer> map = words.stream()
                .map(String::toLowerCase)
                .sorted()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));

        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Object::toString))
                .limit(10)
                .forEach(e -> System.out.println(e.getKey()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.next().replaceAll("[^a-zA-Z0-9]", ""));
        }
        scanner.close();
        printMostFrequentWords(list);
    }
}