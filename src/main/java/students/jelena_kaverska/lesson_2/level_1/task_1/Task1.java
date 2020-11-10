package students.jelena_kaverska.lesson_2.level_1.task_1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        System.out.print("Enter 1st number: ");
        int first = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int second = scanner.nextInt();
        System.out.println("Sum: " + (first+second));
        System.out.println("Subtraction: " + (first-second));
        int multi = first*second;
        System.out.println("Multiplication: " + multi);
        System.out.println("Division: " + (double)first/second);
    }
}