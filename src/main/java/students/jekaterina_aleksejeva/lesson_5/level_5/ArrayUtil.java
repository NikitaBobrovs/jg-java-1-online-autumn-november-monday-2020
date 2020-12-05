package students.jekaterina_aleksejeva.lesson_5.level_5;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }
}

class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil demo = new ArrayUtil();
        int[] number = new int[9];
        demo.fillArrayWithRandomNumbers(number);
        System.out.println(Arrays.toString(number));
    }
}

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        String scenario = " = Array of indicated length Creation Test ";
        int testLength = 7;
        int[] expected = new int[testLength];
        int[] actual = new ArrayUtil().createArray(testLength);
        if (Arrays.equals(expected,actual)) {
            System.out.println("PASS" + scenario);
        } else System.out.println("FAIL" + scenario);
    }
}


