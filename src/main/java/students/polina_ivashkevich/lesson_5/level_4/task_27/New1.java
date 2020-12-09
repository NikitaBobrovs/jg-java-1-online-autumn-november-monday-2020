package students.polina_ivashkevich.lesson_5.level_4.task_27;

import java.util.Arrays;
import java.util.Random;

public class New1 {
    public static void main(String[] args) {
        int num;
        num = ((int) (Math.random() * 10));
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = ((int) (Math.random() * 10));
            System.out.print(numbers[i] + " ");
        }
        int maxValue = numbers[0];
        for (int i = 0; i < num; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }

        }
        System.out.print("max:" + maxValue);
    }

}









