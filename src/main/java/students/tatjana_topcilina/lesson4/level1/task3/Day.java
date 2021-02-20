package students.tatjana_topcilina.lesson4.level1.task3;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter whole number from 1 till 7");
        int number = scan.nextInt();

        if (number == 1)
            System.out.println("Monday");
        else if (number == 2)
            System.out.println("Tuesday");
        else if (number == 3)
            System.out.println("Wednesday");
        else if (number == 4)
            System.out.println("Thursday");
        else if (number == 5)
            System.out.println("Friday");
        else if (number == 6)
            System.out.println("Saturday");
        else if (number == 7)
            System.out.println("Sunday");
    }

}
