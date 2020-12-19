package students.jana_sergejenko.lesson_4.level_2.task_5;

import java.util.Scanner;

public class Program5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num = scan.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scan.nextInt();
        scan.close();

        if (num>num2) {
            System.out.println(num+" is greater");
        } else  {
            System.out.println(num2+" is greater");
        }
    }
}
