import java.util.*;

public class Main {
    static class Box<T> {
        // your code here
        T t;

        public Box(T t) {
            this.t = t;
        }

        public T getT() {
            return t;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            // your code here
            Box<Integer> box = new Box<>(num);
            System.out.println(box.getT());
        } else if (sc.hasNextFloat()) {
            float num = sc.nextFloat();
            // your code here
            Box<Float> box = new Box<>(num);
            System.out.println(box.getT());
        } else {
            String str = sc.next();
            // your code here
            Box<String> box = new Box<>(str);
            System.out.println(box.getT());
        }
    }
}