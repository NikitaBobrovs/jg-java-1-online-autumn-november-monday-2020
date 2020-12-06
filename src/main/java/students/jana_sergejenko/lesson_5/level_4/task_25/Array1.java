package students.jana_sergejenko.lesson_5.level_4.task_25;

import java.util.Scanner;

class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int n;
        System.out.println("Please enter array length");
        n = input.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Please enter number");
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
