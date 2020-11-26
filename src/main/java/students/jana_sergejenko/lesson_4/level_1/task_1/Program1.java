package students.jana_sergejenko.lesson_4.level_1.task_1;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scan.nextInt();
        scan.close();

        if(num>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }

    }
}
