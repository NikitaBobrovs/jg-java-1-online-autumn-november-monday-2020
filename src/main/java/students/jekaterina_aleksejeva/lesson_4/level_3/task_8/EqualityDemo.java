package students.jekaterina_aleksejeva.lesson_4.level_3.task_8;

import java.util.Scanner;

class EqualityDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Equality check = new Equality();
        System.out.println("Enter number 1: ");
        check.number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        check.number2 = scanner.nextInt();
        System.out.println("Enter number 3: ");
        check.number3 = scanner.nextInt();

        check.ifEqual();
    }
}
