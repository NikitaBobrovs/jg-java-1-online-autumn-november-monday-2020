package students.tatjana_topcilina.lesson4.level1.task4;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter whole number");
        int number = scanner.nextInt();
        if (number %2 == 0)
            System.out.println("Your number is even");

        else
            System.out.println("Your number is odd");


    }
}
