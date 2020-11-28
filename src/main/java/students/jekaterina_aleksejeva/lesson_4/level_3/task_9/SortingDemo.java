package students.jekaterina_aleksejeva.lesson_4.level_3.task_9;

import java.util.Scanner;

class SortingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sorting check = new Sorting();
        System.out.println("Enter number 1: ");
        check.number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        check.number2 = scanner.nextInt();
        System.out.println("Enter number 3: ");
        check.number3 = scanner.nextInt();

        check.order();
    }
}

