package students.jana_sergejenko.lesson_4.level_1.task_3;

import java.util.Scanner;

public class Program3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number from range 1-7: ");
        int num = scan.nextInt();
        scan.close();

        if(num==1){
            System.out.println("Monday");
        }
        else if(num==2){
            System.out.println("Tuesday");
        }
        else if(num==3){
            System.out.println("Wednesday");
        }
        else if(num==4){
            System.out.println("Thursday");
        }
        else if(num==5){
            System.out.println("Friday");
        }
        else if(num==6){
            System.out.println("Saturday");
        }
        else if(num==7){
            System.out.println("Sunday");
        }
        else {
            System.out.println("Wrong number");
        }

    }
}
