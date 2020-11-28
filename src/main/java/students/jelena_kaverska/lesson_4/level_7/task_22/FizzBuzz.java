package students.jelena_kaverska.lesson_4.level_7.task_22;

class FizzBuzz {

    public String detect(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "" +  number;
        }
    }
}

class FizzBuzzTest {
    public static void main(String[] args) {
        testDivisibleByThreeOnly();
        testDivisibleByFiveOnly();
        testDivisibleByThreeAndFive();
        testNonDivisibleByThreeAndFive();
    }

    static void testDivisibleByThreeOnly() {
        String scenario = "Divisible by 3 only: 9";
        String expected = "Fizz";
        int number = 9;
        String actual = new FizzBuzz().detect(number);
        if (actual.equals(expected)) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void testDivisibleByFiveOnly() {
        String scenario = "Divisible by 5 only: 50";
        String expected = "Buzz";
        int number = 50;
        String actual = new FizzBuzz().detect(number);
        if (actual.equals(expected)) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void testDivisibleByThreeAndFive() {
        String scenario = "Divisible by 3 and 5: 75";
        String expected = "FizzBuzz";
        int number = 75;
        String actual = new FizzBuzz().detect(number);
        if (actual.equals(expected)) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void testNonDivisibleByThreeAndFive() {
        String scenario = "Non divisible by 3 or 5: 11";
        int number = 11;
        String expected = "" + 11;
        String actual = new FizzBuzz().detect(number);
        if (actual.equals(expected)) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }
}