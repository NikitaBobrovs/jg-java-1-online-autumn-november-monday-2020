package students.tatjana_topcilina.lesson_4.level_1.task_2;
import java.util.Scanner;

public class WholeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter whole number");
        int number = scan.nextInt();

        if (number > 0) {
            System.out.println("Number is positive");}
        else if (number < 0) {
            System.out.println("Number is negative");}
        else {

            System.out.println("Number is zero");}


    }
}
