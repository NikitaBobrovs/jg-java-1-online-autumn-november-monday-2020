package instructor.lesson_5;

public class FizzBuzz {

    public static void main(String[] args) {

        // 3 & 5 = FizzBuzz
        // 3 = Fizz
        // 5 = Buzz

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}


