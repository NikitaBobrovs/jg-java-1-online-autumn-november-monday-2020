package students.eugene_trambovich.lesson_4.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        System.out.println("Please enter any integer: ");
        Scanner scanner = new Scanner(System.in);
        int enteredInteger = scanner.nextInt();


        if (enteredInteger > 0) {
            System.out.println("Entered integer is positive");
        } else {
            System.out.println("Entered integer is negative");
        }

    }
}

class IntegerConditionTest {


    static String checkPosNeg(int x) {

        if (x > 0)
            return "Positive";

        else if (x < 0)
            return "Negative";

        else
            return "zero";
    }

    public static void main(String[] args) {
        int firstNumber = 0;
        System.out.println(firstNumber + " is "
                + checkPosNeg(firstNumber));
    }

}