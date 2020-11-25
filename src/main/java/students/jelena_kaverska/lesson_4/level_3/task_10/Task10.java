package students.jelena_kaverska.lesson_4.level_3.task_10;

import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int first = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int second = scanner.nextInt();
        System.out.print("Enter 3rd number: ");
        int third = scanner.nextInt();

        if (first > second && first > third) {
            System.out.println("greatest is first: " + first);
        } else if (second > first && second > third) {
            System.out.println("greatest is second: " + second);
        } else if (first == second && second == third) {
            System.out.println("All numbers are equal");
        } else if (first == second && second > third) {
            System.out.println("First and second are equal and greatest is: " + second);
        } else if (third > second && first == third) {
            System.out.println("First and third are equal and greatest is: " + third);
        } else if (second == third) {
            System.out.println("Second and third are equal and greatest is: " + third);
        } else {
            System.out.println("greatest is third: " + third);
        }
    }
}