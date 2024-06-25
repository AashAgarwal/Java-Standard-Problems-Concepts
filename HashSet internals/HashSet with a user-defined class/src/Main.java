import java.util.Scanner;
import java.util.*;

class Person {
    private final String name;
    private final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return name.equals(person.name) && age.equals(person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Person> set = new HashSet<>();
        Person p1 = new Person(scanner.next(), scanner.nextInt());
        Person p2 = new Person(scanner.next(), scanner.nextInt());
        Person p3 = new Person(scanner.next(), scanner.nextInt());
        Person p4 = new Person(scanner.next(), scanner.nextInt());

        boolean p1added = set.add(p1);
        boolean p2added = set.add(p2);
        boolean p3added = set.add(p3);
        boolean p4added = set.add(p4);

        if (p1added) {
            System.out.println(p1);
        }
        if (p2added) {
            System.out.println(p2);
        }
        if (p3added) {
            System.out.println(p3);
        }
        if (p4added) {
            System.out.println(p4);
        }
    }
}