package students.jana_sergejenko.lesson_4.level_1.task_2;

import java.util.Scanner;

public class Program2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scan.nextInt();
        scan.close();

        if(num>0){
            System.out.println("Positive");
        }
        else if(num<0){
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }

    }
}
