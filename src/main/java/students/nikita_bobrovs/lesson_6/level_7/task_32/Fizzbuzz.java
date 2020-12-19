package students.nikita_bobrovs.lesson_6.level_7.task_32;

class FizzBuzz {
    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)){
            return "FizzBuzz";
        }
        else if (number % 3 == 0){
            return "Fizz";
        }
        else if (number % 5 == 0){
            return "Buzz";
        }
        else{
            return "" + number;
        }
    }

}

class FizzBuzzTest{
    public static void main(String[] args) {
        FizzBuzzTest subject = new FizzBuzzTest();
        subject.detectTest1();
        subject.detectTest2();
        subject.detectTest3();
        subject.detectTest4();
    }
    boolean stringTester(String expectedResult,String realResult){
        return expectedResult.equals(realResult);
    }
    String printTestResult(boolean tester) {
        if (tester){
            return "(OK)";
        } return "(FAIL)";
    }
    void detectTest1(){
        System.out.println("Detect test. Can divide by 3 and 5 : "+printTestResult
                (stringTester("FizzBuzz",new FizzBuzz().detect(15))));
    }
    void detectTest2(){
        System.out.println("Detect test.Can divide only by 3 : "+printTestResult
                (stringTester("Fizz",new FizzBuzz().detect(9))));
    }
    void detectTest3(){
        System.out.println("Detect test.Can divide only by 5 : "+printTestResult
                (stringTester("Buzz",new FizzBuzz().detect(20))));
    }
    void detectTest4() {
        System.out.println("Detect test.CANNOT divide by 3 or 5 : " + printTestResult
                (stringTester(""+1, new FizzBuzz().detect(1))));
    }
}
