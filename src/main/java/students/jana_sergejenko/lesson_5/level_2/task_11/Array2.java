package students.jana_sergejenko.lesson_5.level_2.task_11;

import java.util.Scanner;

class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number");
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
