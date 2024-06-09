import java.util.Scanner;

public class Main {
    public static String[] decipherCosmicSignal(String[] spaceSignalArray) {
        String[] result = new String[spaceSignalArray.length];
        for (int i = 0; i < spaceSignalArray.length; i++) {
            result[i] = spaceSignalArray[i].replaceAll("~", "");
        }
        return result;
    }    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] encryptedSpaceSignalArray = scanner.nextLine().split("\\s");
        String[] spaceSignalArray = decipherCosmicSignal(encryptedSpaceSignalArray);
        StringBuilder spaceMessage = new StringBuilder();
        for (String signal : spaceSignalArray) {
            spaceMessage.append(signal).append("\s");
        }
        System.out.println(spaceMessage.toString().trim());
    }
}