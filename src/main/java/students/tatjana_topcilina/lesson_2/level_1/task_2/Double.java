package students.tatjana_topcilina.lesson_2.level_1.task_2;

import java.util.Scanner;

public class Double {
    public static void main(String[] args){
        System.out.println ("First double number");
        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println ("Second double number");
        double secondDoubleNumber = scanner.nextDouble();

        double sum = (firstDoubleNumber + secondDoubleNumber);
        double subtraction = (firstDoubleNumber - secondDoubleNumber);
        double multiplication = (firstDoubleNumber * secondDoubleNumber);
        double division = (firstDoubleNumber / secondDoubleNumber);

        System.out.println  ("Sum result :" + sum);
        System.out.println  ("Subtraction result :" + subtraction);
        System.out.println  ("Multiplication result :" + multiplication);
        System.out.println  ("Division result :" + division);

    }
}
