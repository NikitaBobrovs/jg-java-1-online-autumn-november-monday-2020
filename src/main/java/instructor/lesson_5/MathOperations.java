package instructor.lesson_5;

public class MathOperations {

    public static void main(String[] args) {

        int i = 0;

        printIt(++i);
        System.out.println("i = " + i);

        i += 2; // i = i + 2;
        i -= 2; // i = i - 2;
        i *= 2; // i = i * 2;
        i /= 2; // i = i / 2;
    }

    static void printIt(int number) {
        System.out.println("The number is " + number);
    }
}
