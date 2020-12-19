package students.jana_sergejenko.lesson_6.level_4.task_21;

import java.util.Scanner;

class TwoDemensionalArrayMethods {
    int[][] createTwoDimensionalArray(int i) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter size of array");
        int size = console.nextInt();
        int[][] values = new int[size][size];
        return values;
    }

    void generateRandomArray(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                values[i][j] = ((int) (Math.random() * 10));
            }
        }
    }

    void printArray(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
    }

    void sumElemenets(int values[][]) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                sum = sum + values[i][j];
            }
        }
        System.out.println("Sum of elements: " + sum);
    }
}

