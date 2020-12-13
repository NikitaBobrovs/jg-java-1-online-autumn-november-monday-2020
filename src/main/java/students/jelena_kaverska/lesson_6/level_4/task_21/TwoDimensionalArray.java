package students.jelena_kaverska.lesson_6.level_4.task_21;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {

    public int[][] createArray(int rows, int columns) {
        return new int[rows][columns];
    }

    public void populateArray(int[][] array, int limit) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(limit);
            }
        }
    }

    public void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public int sumAllElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}

class MyDemo {
    public static void main(String[] args) {
        TwoDimensionalArray arr = new TwoDimensionalArray();
        int[][] array = arr.createArray(5, 5);
        arr.populateArray(array, 20);
        arr.printArray(array);
        System.out.println("Sum: " + arr.sumAllElements(array));
    }
}