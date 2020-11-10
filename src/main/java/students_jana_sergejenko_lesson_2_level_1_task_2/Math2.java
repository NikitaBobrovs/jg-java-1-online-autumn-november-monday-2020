package students_jana_sergejenko_lesson_2_level_1_task_2;

import java.util.Scanner;

public class Math2 {
    public static void main(String[] args) {
       double addition, subtraction,multiplication,division;

        System.out.println("Enter first number:");
        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Enter second number:");
        double secondDoubleNumber = scanner.nextDouble();

        addition=firstDoubleNumber+secondDoubleNumber;
        subtraction=firstDoubleNumber-secondDoubleNumber;
        multiplication=firstDoubleNumber*secondDoubleNumber;
        division=firstDoubleNumber/secondDoubleNumber;

        System.out.println(firstDoubleNumber+"+"+secondDoubleNumber+"="+addition);
        System.out.println(firstDoubleNumber+"-"+secondDoubleNumber+"="+subtraction);
        System.out.println(firstDoubleNumber+"*"+secondDoubleNumber+"="+multiplication);
        System.out.println(firstDoubleNumber+"/"+secondDoubleNumber+"="+division);
    }
}