package students.polina_ivashkevich.lesson_5.level_6.task_34;

import java.util.Random;

public class ArrayUtil {
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }


        public void printArrayToConsole(int[] array){
        Random random=new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt();
        }
    }

}

