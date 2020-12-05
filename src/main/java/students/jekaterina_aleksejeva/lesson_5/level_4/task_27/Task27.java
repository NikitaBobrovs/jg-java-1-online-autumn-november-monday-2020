package students.jekaterina_aleksejeva.lesson_5.level_4.task_27;

import java.util.Arrays;
import java.util.Random;

public class Task27 {
    public static void main(String[] args) {
        int[] number = new int[15];
        Random random = new Random();
        for (int i = 0; i < number.length; i++) {
        number [i] = random.nextInt(15);
        }

        System.out.println("Your random array is printed: ");
        System.out.println(Arrays.toString(number));
        System.out.println("Maximum number in array is = " + new Task27().getMaxNum(number));
    }

    public int getMaxNum(int[] number){
        int maxNum = number[0];
        for (int i = 1; i < number.length - 1; i++) {
            maxNum = Math.max(maxNum, number [i]);
        }
        return maxNum;
    }
}


