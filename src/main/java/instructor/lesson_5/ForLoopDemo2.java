package instructor.lesson_5;

import java.util.Scanner;

public class ForLoopDemo2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter left bound:");
        int leftBound = scanner.nextInt();

        System.out.println("Enter right bound:");
        int rightBound = scanner.nextInt();

        System.out.println("Expected iterations count = " + (rightBound - leftBound + 1));

        int sum = 0;
        for (int i = leftBound; i <= rightBound; i++) {
            System.out.print(i + " ");
            sum += i;
        }

        double avg = (double) sum / (rightBound - leftBound + 1);

        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println("Avg = " + avg);
    }
}
