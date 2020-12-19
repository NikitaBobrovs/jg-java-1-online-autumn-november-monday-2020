package instructor.lesson_5;

import java.util.Scanner;

public class ForLoopDemo3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter left bound:");
        int leftBound = scanner.nextInt();

        System.out.print("Enter right bound:");
        int rightBound = scanner.nextInt();

        for (int i = leftBound; i < rightBound; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
