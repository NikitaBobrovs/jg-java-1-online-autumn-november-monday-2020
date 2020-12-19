package students.polina_ivashkevich.lesson_5.level_2.task_11;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        int[] numbers=new int[3];
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number: ");
        int number1 = scanner.nextInt();
        numbers[0]=number1;
        System.out.println("Enter number: ");
        int number2 = scanner.nextInt();
        numbers[1]=number2;
        System.out.println("Enter number: ");
        int number3=scanner.nextInt();
        numbers[2]=number3;
        System.out.println(Arrays.toString(numbers));
    }
}

