package students.jelena_kaverska.lesson_4.level_1.task_2;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int number = scanner.nextInt();
        if (number < 0){
            System.out.println("Your number is negative");
        }
        else if (number > 0){
            System.out.println("Your number is positive");
        }
        else {
            System.out.println("Your number equals 0");
        }
    }
}