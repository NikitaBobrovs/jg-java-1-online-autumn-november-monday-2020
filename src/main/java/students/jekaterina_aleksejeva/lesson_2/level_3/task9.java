package students.jekaterina_aleksejeva.lesson_2.level_3;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        System.out.println("Test Data: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer:");
        int number = scanner.nextInt();
        System.out.println("Output:");
        for (int i=1; i <= 10; i ++)
        System.out.println(number + "x" + i + "=" + number*i);
    }
}
