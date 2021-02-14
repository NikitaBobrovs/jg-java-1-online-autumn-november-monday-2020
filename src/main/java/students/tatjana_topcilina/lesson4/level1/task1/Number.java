package students.tatjana_topcilina.lesson4.level1.task1;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter whole number");
        int number = scan.nextInt();

        if (number > 0)
            System.out.println("number is positive");
        else if (number < 0)
            System.out.println("Number is negative");


    }

}
