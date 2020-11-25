package students.jelena_kaverska.lesson_4.level_3.task_8;

import java.util.Scanner;

class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int first = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int second = scanner.nextInt();
        System.out.print("Enter 3rd number: ");
        int third = scanner.nextInt();

        if (first == second && second == third) {
            System.out.println("All numbers are equal");
        } else if (first != second && second != third) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}