package students.tatjana_topcilina.lesson_5.level_2.task_11;

import java.util.Scanner;
import java.util.Arrays;


public class WholeNumber2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter three whole numbers");

        int[] number = new int[3];
        number[0] = scan.nextInt();
        number[1] = scan.nextInt();
        number[2] = scan.nextInt();

        System.out.println(Arrays.toString(number));

    }
}
