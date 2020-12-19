package students.jana_sergejenko.lesson_4.level_1.task_4;

import java.util.Scanner;

public class Program4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scan.nextInt();
        scan.close();

        if (num % 2==0) {
            System.out.println("Even number");
        } else  {
            System.out.println("Odd number");
        }
    }
}