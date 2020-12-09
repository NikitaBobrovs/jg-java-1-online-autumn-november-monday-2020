package students.eugene_trambovich.lesson_5.level_4;

import java.util.Scanner;

public class Task_25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int array[] = new int[scanner.nextInt()];
        System.out.println("\"Fill your array with " + array.length + " integers\"");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the next integer:");
            array[i] = scanner.nextInt();
        }
        System.out.println("Your entered integers are: ");
        for (int i : array) {
            System.out.println(i);
        }
    }
}
