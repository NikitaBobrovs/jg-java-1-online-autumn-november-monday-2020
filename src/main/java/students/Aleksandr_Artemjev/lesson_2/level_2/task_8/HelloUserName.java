package students.Aleksandr_Artemjev.lesson_2.level_2.task_8;

import java.util.Scanner;

public class HelloUserName {

    static class Hello {
        public static void main(String[] args) {

        }
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter username");
            String username = sc.nextLine();
            System.out.println("Hello" + username);
        }
    }
}
