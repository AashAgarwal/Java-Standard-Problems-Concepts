import java.util.*;
import java.util.stream.Collectors;

class CollectionUtils {

    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        ArrayList<Integer> number = new ArrayList<>(numbers);
        Collection<Integer> square = new ArrayList<>();
        for (int i = 0; i < number.size(); i++) {
            square.add(number.get(i) * number.get(i));
        }
        return square;
    }
}

/* Please, do not modify this I/O code */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Collection<Integer> result = CollectionUtils.pow2(numbers);

        System.out.println(result.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}