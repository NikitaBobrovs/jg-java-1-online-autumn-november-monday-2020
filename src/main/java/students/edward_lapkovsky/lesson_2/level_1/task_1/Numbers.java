package students.edward_lapkovsky.lesson_2.level_1.task_1;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = scanner.nextInt();

        System.out.println("Enter Second Number");
        int b = scanner.nextInt();

        int plus = a+b;
        System.out.println("plus : "+plus);

        int minus = a-b;
        System.out.println("minus : "+ minus);

        int multiplication = a*b;
        System.out.println("multiplication : "+multiplication);

        int division = a/b;
        System.out.println("division : "+ division);


    }
}
