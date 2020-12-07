package students.anna_tim.lesson_4.level_2.task_5;

import java.util.Scanner;

class Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number (should be integer):");
        int num1 = scanner.nextInt();

        System.out.println("Please enter second number (should be integer):");
        int num2 = scanner.nextInt();

        if (num1 > num2)
            System.out.println(num1+ " is greater than " + num2);
        else if (num1 < num2)
            System.out.println(num2+ " is greater than " + num1);
        else
            System.out.println("The numbers are equal");
    }
}
