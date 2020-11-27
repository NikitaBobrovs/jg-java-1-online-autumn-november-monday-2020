package students.jana_sergejenko.lesson_4.level_2.task_7;

import java.util.Scanner;

public class Program7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num = scan.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scan.nextInt();
        scan.close();

        if (num==num2) {
            System.out.println("Numbers are equals ");
        } else  {
            System.out.println("Numbers are different");
        }
    }
}
