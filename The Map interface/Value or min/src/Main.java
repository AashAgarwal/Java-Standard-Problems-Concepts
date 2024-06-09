import java.util.*;

class Main {
    private static int getOrMin(Map<String, Integer> map, String key) {
        // implement me
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        return map.getOrDefault(key, list.get(0));
    }

    // do not change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> m = new HashMap<>();
        int size = scanner.nextInt();
        for (int i = 0; i < size; ++i) {
            String key = scanner.next();
            int value = scanner.nextInt();
            m.put(key, value);
        }
        String key = scanner.next();
        int result = getOrMin(Map.copyOf(m), key);
        System.out.println(result);
    }
}