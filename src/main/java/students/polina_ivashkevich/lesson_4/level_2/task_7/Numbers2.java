package students.polina_ivashkevich.lesson_4.level_2.task_7;

import java.util.Scanner;

public class Numbers2 {
    public static void main(String[] args) {
        java.util.Scanner number = new Scanner(System.in);
        System.out.println("Enter first whole number ");
        int num1 = number.nextInt();

        java.util.Scanner number1 = new Scanner(System.in);
        System.out.println("Enter first whole number ");
        int num2 = number1.nextInt();
        if (num1==num2){
            System.out.println("Numbers are equals");
        }if (num1!=num2) {
            System.out.println("Numbers are different");
        }
    }
}
