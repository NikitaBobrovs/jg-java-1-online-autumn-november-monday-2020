package students.viktors_cesnokovs.lesson_5.level_4.task_27;

import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length;i++){
            arr[i]=new Random().nextInt(100);
        }
        System.out.println("Array numbers : ");
        for (int result : arr){
            System.out.println(result);
        }
        System.out.println("Array max number : "+ Arrays.stream(arr).max().getAsInt());
    }
}
