package instructor.qa;

public class Function {

    public static void main(String[] args) {

        int r1 = sqr(2);
        int r2 = sqr(5);

        System.out.println(r1);
        System.out.println(r2);

        String r3 = asString(12345);

        System.out.println(r3);

    }

    public static int sqr(int x) {
        return x * x;
    }

    public static String asString(int number) {
        return String.valueOf(number);
    }

    public static Dog foo() {
        Dog dog = new Dog();
        return dog;
    }
}

class Dog {

}

// sin(90) = 0 / 1
// cos(90) = 1 / 0


// f(x) = y

// sqr(x) = x * x
// sqr(2) => 2 * 2 => 4
// sqr(5) => 5 * 5 => 25
