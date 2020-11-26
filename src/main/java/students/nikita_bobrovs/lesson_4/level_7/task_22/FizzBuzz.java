package students.nikita_bobrovs.lesson_4.level_7.task_22;

class FizzBuzz {
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
        detectTest1();
        detectTest2();
        detectTest3();
        detectTest4();
    }

    static void detectTest1(){
        System.out.println("Detect test.Can divide by 3 and 5");
        String expectedResult = "FizzBuzz";

        FizzBuzz subject = new FizzBuzz();
        String realResult = subject.detect(15);

        if (expectedResult.equals(realResult)){
            System.out.println("(OK)");
        } else
            System.out.println("(FAIL)");
    }
    static void detectTest2(){
        System.out.println("Detect test.Can divide by 3");
        String expectedResult = "Fizz";

        FizzBuzz subject = new FizzBuzz();
        String realResult = subject.detect(9);

        if (expectedResult.equals(realResult)){
            System.out.println("(OK)");
        } else
            System.out.println("(FAIL)");
    }
    static void detectTest3(){
        System.out.println("Detect test.Can divide by 5");
        String expectedResult = "Buzz";

        FizzBuzz subject = new FizzBuzz();
        String realResult = subject.detect(20);

        if (expectedResult.equals(realResult)){
            System.out.println("(OK)");
        } else
            System.out.println("(FAIL)");
    }
    static void detectTest4(){
        System.out.println("Detect test.CANNOT divide by 3 or 5");
        String expectedResult = ""+1;

        FizzBuzz subject = new FizzBuzz();
        String realResult = subject.detect(1);

        if (expectedResult.equals(realResult)){
            System.out.println("(OK)");
        } else
            System.out.println("(FAIL)");
    }
}
