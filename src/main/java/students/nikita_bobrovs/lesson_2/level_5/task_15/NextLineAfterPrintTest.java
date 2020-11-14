package students.nikita_bobrovs.lesson_2.level_5.task_15;


import java.util.Scanner;

public class NextLineAfterPrintTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your name under this text: ");
        String name = scan.nextLine();
        System.out.print("Type tour name next to this text: ");
        String nameTwo = scan.next();
    }
}
