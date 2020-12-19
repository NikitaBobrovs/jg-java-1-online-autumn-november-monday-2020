package students.jekaterina_aleksejeva.lesson_5.level_6.tasks_34_38_updated;

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

    }
// Task_34
    public void printArrayToConsole(int[] array) {
        System.out.println("Print out of integers of array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

    }
// Task_35
    public int findMaxNumber(int[] array) {
        int maxNum = array [0];
        for (int i = 1; i < array.length; i++) {
            maxNum = Math.max(maxNum,array[i]);
        }
        return maxNum;

    }
// Task_37
    public int findMinNumber(int[] array) {
        int minNum = array [0];
        for (int i = 1; i < array.length; i++) {
            minNum = Math.min(minNum,array[i]);
        }
        return minNum;

    }
}
class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil demo = new ArrayUtil();
        int[] array = new int[3];
        demo.fillArrayWithRandomNumbers(array);
        //System.out.println(Arrays.toString(array));
        demo.printArrayToConsole(array);
        System.out.println();
        System.out.println("Maximum number in array = " + demo.findMaxNumber(array));
        System.out.println("Minimum number in array = " + demo.findMinNumber(array));

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
        String scenario = " = Array of indicated length Creation Test ";
        int testLength = 7;
        int[] expected = new int[testLength];
        int[] actual = new ArrayUtil().createArray(testLength);
        if (Arrays.equals(expected, actual)) {
            System.out.println("PASS" + scenario);
        } else System.out.println("FAIL" + scenario);

    }
// Task_36
    public void shouldFindMaxNumber() {
        String scenario = " = Max number Test";
        int[] testArray = new ArrayUtil().createArray(5);
        testArray[0] = 1;
        testArray[1] = -1;
        testArray[2] = 0;
        testArray[3] = -25;
        testArray[4] = 25;

        int expectedMax = 25;
        int actualMax = new ArrayUtil().findMaxNumber(testArray);
        if(expectedMax == actualMax) {
            System.out.println("PASS" + scenario);
        } else System.out.println("FAIL" + scenario);

    }
// Task_38
    public void shouldFindMinNumber() {
        String scenario = " = Min number Test";
        int[] testArray = new ArrayUtil().createArray(7);
        testArray[0] = -100;
        testArray[1] = -100;
        testArray[2] = -1000;
        testArray[3] = -100;
        testArray[4] = -100;
        testArray[5] = -100;
        testArray[6] = -100;

        int expectedMin = -1000;
        int actualMin = new ArrayUtil().findMinNumber(testArray);
        if(expectedMin == actualMin) {
            System.out.println("PASS" + scenario);
        } else System.out.println("FAIL" + scenario);

    }

}
