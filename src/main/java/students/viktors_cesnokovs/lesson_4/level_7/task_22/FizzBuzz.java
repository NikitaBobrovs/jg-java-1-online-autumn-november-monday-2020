package students.viktors_cesnokovs.lesson_4.level_7.task_22;

public class FizzBuzz {
    String detect(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else
            return "" + number;
    }
}



class FizzBuzzTest {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    static void test1() {
        String test1 = "Делится на 3 : 27";
        String expected = "Fizz";
        int number = 27;
        String actual = new FizzBuzz().detect(number);
        if (actual.equals(expected)) {
            System.out.println("OK: " + test1);
        } else {
            System.out.println("FAIL: " + test1);
        }
    }

    static void test2() {
        String test2 = "Делится на 5 : 100";
        String expected = "Buzz";
        int number = 100;
        String actual = new FizzBuzz().detect(number);
        if (actual.equals(expected)) {
            System.out.println("OK: " + test2);
        } else {
            System.out.println("FAIL: " + test2);
        }
    }

    static void test3() {
        String test3 = "Делится на 3 и 5: 60";
        String expected = "FizzBuzz";
        int number = 60;
        String actual = new FizzBuzz().detect(number);
        if (actual.equals(expected)) {
            System.out.println("OK: " + test3);
        } else {
            System.out.println("FAIL: " + test3);
        }
    }

    static void test4() {
        String test4 = "Не делится на  3 или 5: 4";
        int number = 4;
        String expected = "" + 4;
        String actual = new FizzBuzz().detect(number);
        if (actual.equals(expected)) {
            System.out.println("OK: " + test4);
        } else {
            System.out.println("FAIL: " + test4);
        }
    }
}
