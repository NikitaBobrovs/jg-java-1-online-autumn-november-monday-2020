package students.viktors_cesnokovs.lesson_2.level_3.task_9;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Vvedite celoe chislo: ");
        Scanner scan = new Scanner(System.in);
        int cislo = scan.nextInt();
        for (int i = 1; i <= 10; ++i) {
            System.out.println(cislo + "*" + i + "= " + (cislo * i));

        }
    }
}

