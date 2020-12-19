package students.jana_sergejenko.lesson_6.level_7.task_32;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.scenario1();
        test.scenario2();
        test.scenario3();
        test.scenario4();
    }
        private void checkTestResult(boolean condition, String testName) {
            if (condition) {
                System.out.println(testName + " = OK!");
            } else {
                System.out.println(testName + " = FAIL!");
            }
        }

        public void scenario1() {
            FizzBuzz fizzBuzz = new FizzBuzz();
            String result=fizzBuzz.detect(30);
            String expected="FizzBuzz";
            checkTestResult(expected == result, "FizzBuzz");
        }
        public void scenario2() {
            FizzBuzz fizzBuzz = new FizzBuzz();
            String result=fizzBuzz.detect(10);
            String expected="Buzz";
            checkTestResult(expected == result, "Buzz");
        }
        public void scenario3() {
            FizzBuzz fizzBuzz = new FizzBuzz();
            String result=fizzBuzz.detect(6);
            String expected="Fizz";
            checkTestResult(expected == result, "Fizz");
        }
    public void scenario4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result=fizzBuzz.detect(7);
        System.out.println(result);
        String expected="" +7;
        checkTestResult((result.equals(expected)), "other");
    }
}
