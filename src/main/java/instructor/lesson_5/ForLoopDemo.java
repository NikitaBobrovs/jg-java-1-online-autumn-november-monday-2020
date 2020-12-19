package instructor.lesson_5;

import java.util.Scanner;

public class ForLoopDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter limit = ");
        int limit = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            sum += i; // sum = sum + i;
        }

        System.out.println("The sum is " + sum);
    }
}
