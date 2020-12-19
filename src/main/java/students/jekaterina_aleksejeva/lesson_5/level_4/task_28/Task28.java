package students.jekaterina_aleksejeva.lesson_5.level_4.task_28;

import java.util.Arrays;
import java.util.Random;

public class Task28 {
    public static void main(String[] args) {
        int[] number = new int[11];
        Random random = new Random();
        for (int i = 0; i < number.length; i++) {
            number [i] = random.nextInt(9);
        }

        System.out.println("Your random array is printed: ");
        System.out.println(Arrays.toString(number));
        System.out.println("Minimum number in array is = " + new Task28().getMinNum(number));
    }

    public int getMinNum(int[] number){
        int minNum = number[0];
        for (int i = 1; i < number.length - 1; i++) {
            minNum = Math.min(minNum, number [i]);
        }
        return minNum;
    }
}


