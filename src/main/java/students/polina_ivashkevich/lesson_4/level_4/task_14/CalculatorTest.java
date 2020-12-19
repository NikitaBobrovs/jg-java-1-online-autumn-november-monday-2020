package students.polina_ivashkevich.lesson_4.level_4.task_14;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.maxOfTwoNumbers();
    }



    public void maxOfTwoNumbers(){
        int firstNumber=9;
        int secondNumber=9;

        Calculator calculator = new Calculator();
        if(firstNumber>secondNumber) {
            System.out.println(firstNumber);
        }if(secondNumber>firstNumber){
            System.out.println("The biggest number is:"+secondNumber);
        } else{
            System.out.println("Numbers are equals");
        }
    }
}
