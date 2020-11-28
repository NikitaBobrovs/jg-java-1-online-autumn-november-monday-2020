package students.polina_ivashkevich.lesson_4.level_3.task_8;

import java.util.Scanner;

public class ThreeNum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter three numbers :");

        int num1= num.nextInt();
        System.out.println(num1);
        int num2 = num.nextInt();
        System.out.println(num2);
        int num3 = num.nextInt();
        System.out.println(num3);

        if ((num1==num2)&&(num2==num3) ) {
            System.out.println("All numbers are equal");
        }if ((num1!=num2)&&(num2!=num3)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

        }
}
