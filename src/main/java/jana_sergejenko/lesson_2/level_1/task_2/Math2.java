package jana_sergejenko.lesson_2.level_1.task_2;

import java.util.Scanner;

public class Math2 {
    public static void main(String[] args) {

        System.out.println("Enter first number:");
        Scanner scanner = new Scanner(System.in);
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Enter second number:");
        double secondDoubleNumber = scanner.nextDouble();

        double addition=firstDoubleNumber+secondDoubleNumber;
        double subtraction=firstDoubleNumber-secondDoubleNumber;
        double multiplication=firstDoubleNumber*secondDoubleNumber;
        double division=firstDoubleNumber/secondDoubleNumber;

        System.out.println(firstDoubleNumber+"+"+secondDoubleNumber+"="+addition);
        System.out.println(firstDoubleNumber+"-"+secondDoubleNumber+"="+subtraction);
        System.out.println(firstDoubleNumber+"*"+secondDoubleNumber+"="+multiplication);
        System.out.println(firstDoubleNumber+"/"+secondDoubleNumber+"="+division);
    }
}


