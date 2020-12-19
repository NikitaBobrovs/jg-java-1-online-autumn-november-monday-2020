package students.jana_sergejenko.lesson_5.level_5.task_33;

public class ArrayUtilTest {
    public static void main(String[] args) { int[] numbers = new int[10];
       ArrayUtil arrayUtil = new ArrayUtil();
       arrayUtil.fillArrayWithRandomNumbers(numbers);
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
