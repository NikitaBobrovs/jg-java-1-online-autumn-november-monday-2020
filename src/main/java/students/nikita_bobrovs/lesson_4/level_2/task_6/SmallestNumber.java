package students.nikita_bobrovs.lesson_4.level_2.task_6;

import java.util.Scanner;

class SmallestNumber {
    public static void main(String[] args) {
        System.out.println("Enter two round numbers");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a < b)
            System.out.println(a + " is smaller.");
        else
            System.out.println(b + " is smaller.");
    }
}
