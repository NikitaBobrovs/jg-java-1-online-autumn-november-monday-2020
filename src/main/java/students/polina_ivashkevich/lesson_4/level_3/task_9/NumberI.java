package students.polina_ivashkevich.lesson_4.level_3.task_9;

import java.util.Scanner;

public class NumberI {
    public static void main(String[] args) {
        java.util.Scanner n =new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int number1 = n.nextInt();
        System.out.println(number1);
        int number2 = n.nextInt();
        System.out.println(number2);
        int number3 = n.nextInt();
        System.out.println(number3);

        if (number1<2) {
            number1=+number1;
            System.out.println("increasing "+number1);
        } if (number2 <2) {
            number2 =+number2;
            System.out.println("increasing "+number2);
        }if (number3<2) {
            number3 =+number3;
            System.out.println("increasing "+number3);
        }if (number1>6) {
            number1 = -number1;
            System.out.println("decreasing "+ number1);
        } if (number2>6) {
            number2 =-number2;
            System.out.println("decreasing "+ number2);
        }if (number3>6) {
            number3 =-number3;
            System.out.println("decreasing " + number3);
        }else  {
            System.out.println("Neither increasing or decreasing order" + n);

    }
}
}
