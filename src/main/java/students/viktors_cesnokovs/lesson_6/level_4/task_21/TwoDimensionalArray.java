package students.viktors_cesnokovs.lesson_6.level_4.task_21;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArray {
    public int[][] createArr(int rows, int columns) {
        return new int[rows][columns];
    }

    public void fillArr(int[][] arr, int limit) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int y = 0; y < arr[i].length; y++) {
                arr[i][y] = random.nextInt(limit);
            }
        }
    }

    public void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public int sumAll(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int y = 0; y < arr[i].length; y++) {
                sum += arr[i][y];
            }
        }
        return sum;
    }
}

class Demo {
    public static void main(String[] args) {
        TwoDimensionalArray arr = new TwoDimensionalArray();
        int[][] array = arr.createArr(4, 4);
        arr.fillArr(array, 10);
        arr.printArr(array);
        System.out.println("Sum : " + arr.sumAll(array));
    }
}
