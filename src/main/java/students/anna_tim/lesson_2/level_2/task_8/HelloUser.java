package students.anna_tim.lesson_2.level_2.task_8;

import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");

        //тут вопрос про next(String pattern) и nextLine() - что-то я не уловила разницу.. в чём она?
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        scanner.close();
    }
}
