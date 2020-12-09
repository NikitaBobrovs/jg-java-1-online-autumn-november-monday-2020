package students.anna_tim.lesson_2.level_3.task_9;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number (should be integer):");
        int number = scanner.nextInt();

        //тут точно так? или нужно было каким-то образом использовать цикл?
        System.out.println(number + " x 1 = " + number);
        System.out.println(number + " x 2 = " + number * 2);
        System.out.println(number + " x 3 = " + number * 3);
        System.out.println(number + " x 4 = " + number * 4);
        System.out.println(number + " x 5 = " + number * 5);
        System.out.println(number + " x 6 = " + number * 6);
        System.out.println(number + " x 7 = " + number * 7);
        System.out.println(number + " x 8 = " + number * 8);
        System.out.println(number + " x 9 = " + number * 9);
        System.out.println(number + " x 10 = " + number * 10);


        scanner.close();
    }
}


