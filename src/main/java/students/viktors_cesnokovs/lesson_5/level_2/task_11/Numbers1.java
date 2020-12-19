package students.viktors_cesnokovs.lesson_5.level_2.task_11;

import java.util.Scanner;

public class Numbers1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers");

        int[] number = new int[3];
        number[0] = scan.nextInt();
        number[1] = scan.nextInt();
        number[2] = scan.nextInt();

        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
    }
}