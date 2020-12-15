package students.jekaterina_aleksejeva.lesson_6.level_4.task_21;

import java.util.Random;

class TwoDimensionalArray {
    public int[] [] create2DArray(int i, int j) {
        return new int[i] [j];

    }

    public void fill2DArray (int [] [] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array [i] [j] = random.nextInt();

            }
        }
    }

    public void printOut2DArray (int [] [] array) {
        System.out.println("2 Dimensional Array: " );
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array [i] [j] + " ");
            }
            System.out.println();

        }

    }

    public int sum2DArray (int [] [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        } return sum;

    }

}

class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        TwoDimensionalArray demo  = new TwoDimensionalArray();
        int [] [] array = demo.create2DArray(2,2);
        demo.fill2DArray(array);
        demo.printOut2DArray(array);
        System.out.println("Sum of all elements of Array = " + demo.sum2DArray(array));

    }
}


