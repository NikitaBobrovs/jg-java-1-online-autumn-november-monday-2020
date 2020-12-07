package students.anna_tim.lesson_4.level_2.task_7;

import java.util.Scanner;

class EqualOrDifferent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number (should be integer):");
        int num1 = scanner.nextInt();

        System.out.println("Please enter second number (should be integer):");
        int num2 = scanner.nextInt();

        if (num1 == num2)
            System.out.println("Numbers "+num1+" and "+num2+" are equal.");
        else
            System.out.println("The numbers "+num1+" and "+num2+" are different.");
    }
}
