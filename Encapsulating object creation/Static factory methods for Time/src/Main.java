import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static Time noon() {
        return new Time(12, 0, 0);
    }

    public static Time midnight() {
        return new Time(0, 0, 0);
    }

    public static Time ofSeconds(long seconds) {
        int tmp = (int) seconds / 3600;
        int hour = tmp > 23 ? tmp % 24 : tmp;
        int minutes = (int) (seconds % 3600) / 60;
        int second = (int) seconds % 60;
        return new Time(hour, minutes, second);
    }

    public static Time of(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            return new Time(hour, minute, second);
        }
        return null;
    }
}

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                break;
        }

        if (time == null) {
            System.out.println("null");
        } else {
            System.out.printf("%s %s %s", time.hour, time.minute, time.second);
        }
    }
}