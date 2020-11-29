package students.anna_tim.lesson_3.level_2.task_9;

import java.util.Scanner;

public class ReadTextInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String nameEntered = scanner.nextLine();

        System.out.println("Hello "+nameEntered+" ! Glad to see you!");

    }
}
