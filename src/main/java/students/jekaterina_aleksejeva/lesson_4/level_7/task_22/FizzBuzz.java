package students.jekaterina_aleksejeva.lesson_4.level_7.task_22;

class FizzBuzz {

    public String detect(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else return "" + number;
    }
}

class FizzBuzzTest {
    FizzBuzz test = new FizzBuzz();
    public static void main(String[] args) {
        scenarioReturnNumber();
        scenarioReturnFizzBuzz_1();
        scenarioReturnFizzBuzz_2();
        scenarioReturnFizz();
        scenarioReturnBuzz();
    }

    static void scenarioReturnNumber() {
        String scenario = " as input is not divisible by all of 15, 3 and/or 5";
        String expectedResult = "" + 1;
        String actualResult = new FizzBuzz().detect(1);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS FizzBuzz returned " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }

    }

    static void scenarioReturnFizzBuzz_1() {
        String scenario = " as input is divisible by any 15, 3 and/or 5";
        String expectedResult = "FizzBuzz";
        String actualResult = new FizzBuzz().detect(0);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS FizzBuzz returned " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }

    }
    static void scenarioReturnFizzBuzz_2() {
        String scenario = " as input is divisible by any 15, 3 and/or 5";
        String expectedResult = "FizzBuzz";
        String actualResult = new FizzBuzz().detect(30);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS FizzBuzz returned " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }

    }
    static void scenarioReturnFizz() {
        String scenario = " as input is divisible by 3 and is not divisible by 5";
        String expectedResult = "Fizz";
        String actualResult = new FizzBuzz().detect(12);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS FizzBuzz returned " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }

    }
    static void scenarioReturnBuzz() {
        String scenario = " as input is divisible by 5 and is not divisible by 3";
        String expectedResult = "Buzz";
        String actualResult = new FizzBuzz().detect(25);
        if (expectedResult.equals(actualResult)) {
            System.out.println("PASS FizzBuzz returned " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }

}

