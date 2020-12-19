package students.jelena_kaverska.lesson_2.level_3.task_9;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        System.out.println("Multiplication table: ");
        for (int i=1; i<=10;i++){
            System.out.println(num + " x " + i + " = " + i*num);
        }
    }
}