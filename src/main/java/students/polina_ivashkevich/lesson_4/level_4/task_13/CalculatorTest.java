package students.polina_ivashkevich.lesson_4.level_4.task_13;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.isEvenTest();
        calculatorTest.isOddTest();
    }



    public void isEvenTest () {
        int number=4;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
                if (realResult==true) {
                    System.out.println("Ok");
                } else {
                    System.out.println("Fail");
                }


    }
    public void isOddTest(){
        int number=4;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isOdd(number);
        if(realResult==false) {
            System.out.println("Ok");
        } else {
            System.out.println("Fail");
        }
    }
}
