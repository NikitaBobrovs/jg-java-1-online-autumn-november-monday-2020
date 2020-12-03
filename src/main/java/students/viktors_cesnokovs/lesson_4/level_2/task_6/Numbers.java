package students.viktors_cesnokovs.lesson_4.level_2.task_6;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое целое число : ");
        int a = scan.nextInt();
        System.out.println("Введите второе целое число : ");
        int b = scan.nextInt();

        if ( a < b)
            System.out.println("Первое число наименьшее");
        else
            System.out.println("Второе число наименьшее");
    }
}
