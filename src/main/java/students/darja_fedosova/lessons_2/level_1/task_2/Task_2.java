package students.darja_fedosova.lessons_2.level_1.task_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args){
        Scanner calc = new Scanner(System.in);

        System.out.println("Enter first  double number: ");
        double firstDoubleNumber = calc.nextDouble();
        System.out.println("Enter second double number: ");
        double secondDoubleNumber = calc.nextDouble();

        System.out.println(" Addition = " + ( firstDoubleNumber + secondDoubleNumber));
        System.out.println(" Subtraction = " + (firstDoubleNumber - secondDoubleNumber));
        System.out.println(" Multiplication = " + (firstDoubleNumber * secondDoubleNumber));
        System.out.println(" Division = " + (firstDoubleNumber / secondDoubleNumber));
    }
}
