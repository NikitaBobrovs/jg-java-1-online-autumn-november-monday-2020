package students.viktors_cesnokovs.lesson_4.level_1.task_4;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число : ");
        int number = scan.nextInt();

        if (number % 2 == 0)
            System.out.println("Число четное");
        else
            System.out.println("Число не четное");
    }
}
