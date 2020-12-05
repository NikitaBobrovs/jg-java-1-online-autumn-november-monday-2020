package students.polina_ivashkevich.lesson_5.level_2.task_13;

import students.jana_sergejenko.lesson_1.task_11.Sum;

import java.util.Arrays;
import java.util.Random;

public class Array2 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] array=new int[3];
        array[0]=random.nextInt(10);
        array[1]=random.nextInt(10);
        array[2]=random.nextInt(10);
        System.out.println(Arrays.toString(array));
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];
            System.out.println(sum);
        }


    }



}




