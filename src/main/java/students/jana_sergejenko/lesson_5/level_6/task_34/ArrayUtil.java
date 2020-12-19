package students.jana_sergejenko.lesson_5.level_6.task_34;

public class ArrayUtil {

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public int findMaxNumber(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }

        }
        return maxValue;

    }

    public int findMinNumber(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }

        }
        return minValue;
    }

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

}
