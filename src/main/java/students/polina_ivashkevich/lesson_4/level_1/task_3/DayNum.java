package students.polina_ivashkevich.lesson_4.level_1.task_3;

import java.util.Scanner;

public class DayNum {
    public static void main(String[] args) {
        java.util.Scanner wNum = new Scanner(System.in);
        System.out.println("Please enter whole number in this range 1-7 :");

        int num = wNum.nextInt();
        System.out.println("Whole number is :"+ num  );
        if(num==1) {
            System.out.println("Today is Monday");
        } if (num==2) {
            System.out.println("Today is Tuesday");
        }if (num==3) {
            System.out.println("Today is Wednesday");
        }if (num==4) {
            System.out.println("Today is Thursday");
        }if (num==5) {
            System.out.println("Today is Friday");
        } if (num==6) {
            System.out.println("Today is Saturday");
        }   if (num==7) {
            System.out.println("Today is Sunday");
        }

    }
}
