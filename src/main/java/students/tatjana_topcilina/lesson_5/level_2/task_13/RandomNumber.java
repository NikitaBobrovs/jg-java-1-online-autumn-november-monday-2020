package students.tatjana_topcilina.lesson_5.level_2.task_13;

import java.util.Random;
import java.util.Arrays;

public class RandomNumber {

    public static void main(String[] args) {
        Random random = new Random();

        int[] number = new int[3];

        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt();
        }
        System.out.println("Three random numbers are:  " + Arrays.toString(number));

        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        System.out.println("Random numbers sum = " + sum);

    }

}
