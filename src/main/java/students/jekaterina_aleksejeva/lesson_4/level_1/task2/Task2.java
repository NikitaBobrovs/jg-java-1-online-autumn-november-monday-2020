package students.jekaterina_aleksejeva.lesson_4.level_1.task2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer:  ");
        int integer = scanner.nextInt();

        boolean positive = (integer > 0);
        boolean negative = (integer < 0);


        if (positive) {
            System.out.println(integer + " is positive");}
        else if (negative) {
            System.out.println(integer + " is negative");}

        else { System.out.println(integer + " equals zero");
        }

    }
}




