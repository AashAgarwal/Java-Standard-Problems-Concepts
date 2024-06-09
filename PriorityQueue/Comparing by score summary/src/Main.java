import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Person> queue = createQueue(scanner);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

    public static Queue<Person> createQueue(Scanner scanner) {
        Queue<Person> queue = new PriorityQueue(new PersonComparator());
        queue.add(new Person(scanner.nextInt(), scanner.nextInt()));
        queue.add(new Person(scanner.nextInt(), scanner.nextInt()));
        queue.add(new Person(scanner.nextInt(), scanner.nextInt()));

        return queue;
    }
}

class Person {
    private int mathScore;
    private int physicsScore;

    public Person(int mathScore) {
        this.mathScore = mathScore;
    }

    public Person(int mathScore, int physicsScore) {
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(int physicsScore) {
        this.physicsScore = physicsScore;
    }

    @Override
    public String toString() {
        return mathScore + " " + physicsScore;
    }
}

class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int score1 = p1.getMathScore() + p1.getPhysicsScore();
        int score2 = p2.getMathScore() + p2.getPhysicsScore();
        return Integer.compare(score2, score1);
    }
}