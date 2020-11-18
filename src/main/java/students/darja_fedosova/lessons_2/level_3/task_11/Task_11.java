package students.darja_fedosova.lessons_2.level_3.task_11;

import java.util.Scanner;
public class Task_11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first  number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second  number: ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Enter third  number: ");
        double thirdNumber = scanner.nextDouble();

        System.out.println ("Average = " +(firstNumber+secondNumber+thirdNumber)/3 );
    }
}
