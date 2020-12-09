package students.polina_ivashkevich.lesson_4.level_3.task_8;

import java.util.Scanner;

public class ThreeNum {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int num1;
        int num2 ;
        int num3;
        System.out.println("Enter three numbers :");
        num1= num.nextInt();
        num2=num.nextInt();
        num3=num.nextInt() ;


        if (num1==num2&&num2==num3&&num3==num1){
            System.out.println("All numbers are equal");
        }if (num1!=num2&&num2!=num3&&num3!=num1)  {

            System.out.println("All numbers are different");
        } if(num1!=num2&&num1==num3||num1!=num3&&num1==num2
                ||num3!=num1&&num3==num2||num2!=num3&&num2==num1||num2!=num1&&num2==num3) {
            System.out.println("Neither all are equal or different");
        }

        }
}
