package students.jana_sergejenko.level_7.task_22;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        FizzBuzzTest.scenario1();
        FizzBuzzTest.scenario2();
        FizzBuzzTest.scenario3();
        FizzBuzzTest.scenario4();
    }

    static void scenario1() {
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(9);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Fizz test = OK");
        } else {
            System.out.println("Fizz test = FAIL");
        }
    }

    static void scenario2() {
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(20);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Buzz test = OK");
        } else {
            System.out.println("Buzz test = FAIL");
        }
    }

    static void scenario3() {
        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(15);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("FizzBuzz test = OK");
        } else {
            System.out.println("FizzBuzz test = FAIL");
        }
    }

    static void scenario4() {
        int number=11;
        String expectedResult =""+number;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(11);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Other test = OK");
        } else {
            System.out.println("Other test = FAIL");

        }
    }

}

