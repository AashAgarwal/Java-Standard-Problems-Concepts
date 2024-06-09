import java.util.Scanner;

public class Main {

    private static String message;
    private static int errorCode;

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        message = scanner.nextLine();
        errorCode = Integer.parseInt(scanner.nextLine());

        Callback callback = new Callback() {
            @Override
            public void onStarted() {
                System.out.println("The process started");
            }

            @Override
            public void onStopped(String reason) {
                System.out.println(reason);
            }

            @Override
            public void onFinished(int errorCode) {
                if (errorCode == 0) {
                    System.out.println("The process successfully finished");
                } else {
                    System.out.println("The process is finished with error: " + errorCode);
                }
            }
        };

        startLongProcess(callback);

    }

    public static void startLongProcess(Callback callback) {
        callback.onStarted();
        callback.onStopped(message);
        callback.onStarted();
        callback.onFinished(errorCode);
    }

}

interface Callback {

    void onStarted();

    void onStopped(String cause);

    void onFinished(int code);
}