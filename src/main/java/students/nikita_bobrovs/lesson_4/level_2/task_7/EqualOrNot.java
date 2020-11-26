package students.nikita_bobrovs.lesson_4.level_2.task_7;

import java.util.Scanner;

class EqualOrNot {
    public static void main(String[] args) {
        System.out.println("Enter two round numbers");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a == b)
            System.out.println("Numbers are equal");
        else
            System.out.println("Numbers are different");
    }
}
