package students.nikita_bobrovs.lesson_4.level_2.task_5;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        System.out.println("Enter two round numbers");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a >b)
            System.out.println(a + " is bigger.");
        else
            System.out.println(b + " is bigger.");
    }
}
