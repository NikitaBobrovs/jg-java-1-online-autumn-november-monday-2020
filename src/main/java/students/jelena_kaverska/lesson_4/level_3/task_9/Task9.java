package students.jelena_kaverska.lesson_4.level_3.task_9;

import java.util.Scanner;

class Task9 {

    void printOrder(int a, int b, int c) {
        if (a > b && b > c) {
            System.out.println("Decreasing order");
        } else if (a < b && b < c) {
            System.out.println("Increasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}

class Task9Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int first = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int second = scanner.nextInt();
        System.out.print("Enter 3rd number: ");
        int third = scanner.nextInt();

        Task9 task9 = new Task9();
        task9.printOrder(first, second, third);
    }
}