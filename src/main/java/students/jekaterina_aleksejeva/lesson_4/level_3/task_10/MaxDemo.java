package students.jekaterina_aleksejeva.lesson_4.level_3.task_10;

import java.util.Scanner;

class MaxDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Max check = new Max();
        System.out.println("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter number 3: ");
        int number3 = scanner.nextInt();

        System.out.println (check.maximum(number1, number2, number3) + " is the maximum of 3 numbers");
    }
}
