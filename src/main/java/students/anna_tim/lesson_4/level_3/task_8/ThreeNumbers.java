package students.anna_tim.lesson_4.level_3.task_8;

import java.util.Scanner;

class ThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number (should be integer):");
        int num1 = scanner.nextInt();

        System.out.println("Please enter second number (should be integer):");
        int num2 = scanner.nextInt();

        System.out.println("Please enter third number (should be integer):");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num2 != num3) {
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }
}
