package students.nikita_bobrovs.lesson_2.level_3.task_11;

import java.util.Scanner;

public class NumbersAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        System.out.println("First number:");
        double first = scan.nextDouble();
        System.out.println("Second number:");
        double second = scan.nextDouble();
        System.out.println("Third number:");
        double third = scan.nextDouble();
        double average = (first+second+third)/3;
        System.out.println("Average for these three numbers is : "+ average);
    }
}
