public class Main {
    public static void main(String[] args) {
        Dog fido = new Dog();
        System.out.println(fido.speak());
    }
}

class Animal {
    public String speak() {
        return "Animal sound...";
    }
}

class Dog extends Animal {
    public String speak() {
        return "Bark!";
    }
}