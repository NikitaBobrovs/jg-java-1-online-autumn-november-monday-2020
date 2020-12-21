package students.eugene_trambovich.lesson_3.level_2.task_9;

import java.util.Scanner;

public class HelloUsername {

    public static void main(String[] args) {

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();
        System.out.println("Hello " + inputName + "!");

    }


}
