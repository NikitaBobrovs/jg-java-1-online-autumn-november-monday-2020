package students.anna_tim.lesson_2.level_3.task_9;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number (should be integer):");
        int Number = scanner.nextInt();

        //тут точно так? или нужно было каким-то образом использовать цикл?
        System.out.println(Number + " x 1 = " + Number);
        System.out.println(Number + " x 2 = " + Number * 2);
        System.out.println(Number + " x 3 = " + Number * 3);
        System.out.println(Number + " x 4 = " + Number * 4);
        System.out.println(Number + " x 5 = " + Number * 5);
        System.out.println(Number + " x 6 = " + Number * 6);
        System.out.println(Number + " x 7 = " + Number * 7);
        System.out.println(Number + " x 8 = " + Number * 8);
        System.out.println(Number + " x 9 = " + Number * 9);
        System.out.println(Number + " x 10 = " + Number * 10);


        scanner.close();
    }
}


