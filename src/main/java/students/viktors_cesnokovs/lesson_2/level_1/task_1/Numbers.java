package students.viktors_cesnokovs.lesson_2.level_1.task_1;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First number :");
        int a = scan.nextInt();

        System.out.println("Second number :");
        int b = scan.nextInt();

        int plus = a+b;
        System.out.println("plus : "+ plus);

        int minus = a-b;
        System.out.println("minus : "+ minus);

        int umnozenie = a*b;
        System.out.println("umnozenie : "+ umnozenie);

        int delenie = a/b;
        System.out.println("delenie : "+ delenie);

    }

}
