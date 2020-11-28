package students.viktors_cesnokovs.lesson_4.level_1.task_1;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число : ");
        int number = scan.nextInt();

        if (number > 0)
            System.out.println("Число положительное");
        else if (number < 0)
            System.out.println("Число отрицательное");
        else
            System.out.println("Число равно нулю");

    }
}
