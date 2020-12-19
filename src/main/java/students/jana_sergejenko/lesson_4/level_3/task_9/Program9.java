package students.jana_sergejenko.lesson_4.level_3.task_9;

import java.util.Scanner;

public class Program9{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num = scan.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = scan.nextInt();
        scan.close();

        if (num<num2&num2<num3) {
            System.out.println("increasing");
        } else if(num>num2&num2>num3){
            System.out.println("decreasing");
        }
        else{
            System.out.println("Neither increasing or decreasing order");
        }
    }
}

