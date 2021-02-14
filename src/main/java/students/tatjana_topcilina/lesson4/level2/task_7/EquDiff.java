package students.tatjana_topcilina.lesson4.level2.task_7;

import java.util.Scanner;

public class EquDiff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter first number");
        int number1 = scan.nextInt();
        System.out.println("Please, number second number");
        int number2 = scan.nextInt();
        if (number1 == number2) {
            System.out.println("Numbers are equal");
        }
        if (number1!=number2) {
            System.out.println("Numbers are different");
        }

    }
}


