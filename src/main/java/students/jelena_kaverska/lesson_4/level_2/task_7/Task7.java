package students.jelena_kaverska.lesson_4.level_2.task_7;

import java.util.Scanner;

class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st int-number: ");
        int first = scanner.nextInt();
        System.out.print("Enter 2nd int-number: ");
        int second = scanner.nextInt();
        if (first==second){
            System.out.println("Numbers are equal");
        }
        else {
            System.out.println("Numbers are different");
        }
    }
}