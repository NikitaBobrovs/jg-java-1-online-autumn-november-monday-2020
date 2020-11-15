package students.jelena_kaverska.lesson_2.level_3.task_10;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double rad = scanner.nextDouble();
        System.out.println("Perimeter: " + 2*Math.PI*rad);
        System.out.println("Area: " + Math.PI*rad*rad);
    }
}