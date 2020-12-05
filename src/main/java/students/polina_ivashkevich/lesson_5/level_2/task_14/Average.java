package students.polina_ivashkevich.lesson_5.level_2.task_14;

import students.jana_sergejenko.lesson_1.task_11.Sum;

import java.util.Arrays;
import java.util.Random;

public class Average {
    public static void main(String[] args) {
        Random random = new Random(10);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            System.out.println((numbers[i]));
            int sum=Arrays.stream(numbers).sum();
            System.out.println(sum);
            sum=sum/numbers.length;
            System.out.println(sum);
            }
        }
    }

   //int sum = 0;
        //for (int value : numbers) {
             //   sum += value;
                //System.out.println(sum);