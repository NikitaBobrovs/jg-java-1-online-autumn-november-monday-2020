package instructor.lesson_6;

public class StaticMethodDemo {

    public static void main(String[] args) {

        Greeter.greet();

    }
}

class Greeter {

    static void greet() {
        System.out.println("Hello!");
    }
}
