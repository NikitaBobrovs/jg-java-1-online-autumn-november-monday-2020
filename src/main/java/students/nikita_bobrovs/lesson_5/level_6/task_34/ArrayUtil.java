package students.nikita_bobrovs.lesson_5.level_6.task_34;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }
    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i =0;i<array.length;i++){
            array[i] = new Random().nextInt();
        }
    }
    //task 34
    public void printArrayToConsole(int[] array) {
        System.out.println("Array numbers are :");
        for (int i : array) {
            System.out.println(i);
        }
    }
    //task 35
    public int findMaxNumber(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }
    //task 37
    public int findMinNumber(int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }
}

class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil demo = new ArrayUtil();
        int[] array = demo.createArray(5);
        demo.fillArrayWithRandomNumbers(array);
        demo.printArrayToConsole(array);
        System.out.println("Array max number is : "+demo.findMaxNumber(array));
        System.out.println("Array min number is : "+demo.findMinNumber(array));
    }
}

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        System.out.println("Create array set length test");
        if (Arrays.equals(new ArrayUtil().createArray(5), new int[5])){
            System.out.println("(OK)");
        } else {
            System.out.println("(FAIL)");
        }
    }
// task 36
    public void shouldFindMaxNumber() {
        System.out.println("Find array max number test :");
        int[] subject = new ArrayUtil().createArray(3);
        subject[0] = 1;
        subject[1] = 5;
        subject[2] = 3;
        int expectedResult = 5;
        if (expectedResult == new ArrayUtil().findMaxNumber(subject)) {
            System.out.println("(OK)");
        } else {
            System.out.println("(FAIL)");
        }
    }
// task 38
    public void shouldFindMinNumber() {
        System.out.println("Find array min number test :");
        int[] subject = new ArrayUtil().createArray(3);
        subject[0] = 10;
        subject[1] = -5;
        subject[2] = 0;
        int expectedResult = -5;
        if (expectedResult == new ArrayUtil().findMinNumber(subject)){
            System.out.println("(OK)");
        } else {
            System.out.println("(FAIL)");
        }
    }
}
