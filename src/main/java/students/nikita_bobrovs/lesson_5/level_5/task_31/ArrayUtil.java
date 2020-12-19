package students.nikita_bobrovs.lesson_5.level_5.task_31;

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {
    public int[] createArray(int arrayLength){
        return new int[arrayLength];
    }
    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i =0;i<array.length;i++){
            array[i] = new Random().nextInt();
        }
    }
}


class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil demo = new ArrayUtil();
        int[] array = demo.createArray(5);
        demo.fillArrayWithRandomNumbers(array);
        for(int i : array){
            System.out.println(i);
        }
    }
}


class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }
    public void shouldCreateArray() {
        System.out.println("Create array set length test");
        if (Arrays.equals(new ArrayUtil().createArray(5), new int[5])){
            System.out.println("(OK)");
        } else {
            System.out.println("(FAIL)");
        }
    }
}
