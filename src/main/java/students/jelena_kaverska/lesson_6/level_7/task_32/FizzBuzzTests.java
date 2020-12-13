package students.jelena_kaverska.lesson_6.level_7.task_32;

class FizzBuzzTests {
    FizzBuzz fb = new FizzBuzz();

    public boolean areEqual(String exp, String act) {
        return exp.equals(act);
    }

    public String printResult(boolean result) {
        if (result) {
            return "PASSED";
        }
        else {
            return "FAILED";
        }
    }

    public void testFizzBuzz() {
        System.out.println("FizzBuzz test: " + printResult(areEqual("FizzBuzz", fb.detect(75))));
    }

    public void testFizz() {
        System.out.println("Fizz test: " + printResult(areEqual("Fizz", fb.detect(81))));
    }

    public void testBuzz() {
        System.out.println("Buzz test: " + printResult(areEqual("Buzz", fb.detect(20))));
    }

    public void testNoFizzBuzz() {
        System.out.println("No Fizz, no Buzz, no FizzBuzz test: " + printResult(areEqual("23", fb.detect(23))));
    }

    public static void main(String[] args) {
        FizzBuzzTests test = new FizzBuzzTests();
        test.testFizzBuzz();
        test.testFizz();
        test.testBuzz();
        test.testNoFizzBuzz();
    }
}