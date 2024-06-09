public class Main {
    public static void main(String[] args) {
        String oldString = "\"Why do programmers prefer dark mode?\" she asked.\n" +
                "\"Because light attracts bugs!\" I replied.";

        String youngAndStrongTextBlock = """
                "Why do programmers prefer dark mode?" she asked.
                "Because light attracts bugs!" I replied.
                """;

        System.out.println(youngAndStrongTextBlock);
    }
}