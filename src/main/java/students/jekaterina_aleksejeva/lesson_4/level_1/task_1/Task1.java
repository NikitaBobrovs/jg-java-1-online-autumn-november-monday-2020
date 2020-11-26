package students.jekaterina_aleksejeva.lesson_4.level_1.task_1;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter integer:  ");
    int integer = scanner.nextInt();


    if (integer >0) {
        System.out.println("Result: Integer is positive" ); }
    else if (integer <0) {
        System.out.println("Result: Integer is negative"); }
    else {System.out.println("Result: neither positive nor negative"); }
}
}
