package students.jelena_kaverska.lesson_12.level_3.task_19;

import java.util.Scanner;

class WrongUserInputHandlingDemo {

    //запрашивает у пользователя целое число
    //- если пользователь введёт не число а строку программа должна сообщить
    //  пользователю о допущенной ошибке и запросить ввести целое число еще раз.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        while (!valid) {
            System.out.println("Enter int number: ");
            try {
                int number = Integer.parseInt(scanner.next());
                valid = true;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}