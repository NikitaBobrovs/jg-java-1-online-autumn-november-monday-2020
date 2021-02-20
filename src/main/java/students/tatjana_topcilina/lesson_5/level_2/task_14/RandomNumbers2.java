package students.tatjana_topcilina.lesson_5.level_2.task_14;

import java.util.Arrays;
import java.util.Random;


public class RandomNumbers2 {


        public static void main(String[] args) {
            Random random = new Random();

            int[] number = new int[3];

            for (int i = 0; i < number.length; i++) {
                number[i] = random.nextInt();
            }
            System.out.println("Three random numbers are:  " + Arrays.toString(number));

            double sum = 0;
            for (int i : number) {
                sum += i;
            }
            double avg = sum / number.length;
            System.out.println("Avg = " + sum);
        }
}
