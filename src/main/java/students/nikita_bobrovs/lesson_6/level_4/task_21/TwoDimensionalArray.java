package students.nikita_bobrovs.lesson_6.level_4.task_21;

import java.util.Random;
class TwoDimensionalArray {

    void fillWithRandomInt(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++)
                array[i][j] = new Random().nextInt(10);
        }
    }

    int calculate(int[][] array) {
        int sum = 0;
        for (int[] arr : array) {
            for (int j =0;j<array[0].length;j++) {
                sum += arr[j];
            }
        }
        return sum;
    }

    void printInfo(int[][] array) {
        for (int[] arr : array) {
            for (int j = 0;j<array[0].length;j++) {
                System.out.print(arr[j] + "  ");
            }
            System.out.println();
        }
    }
}

class Demo{
    public static void main(String[] args) {
        TwoDimensionalArray demo = new TwoDimensionalArray();
        int[][] array = new int[3][3];
        demo.printInfo(array);

        System.out.println("===========");
        demo.fillWithRandomInt(array);
        demo.printInfo(array);

        System.out.println("===========");
        System.out.println("Sum : "+demo.calculate(array));
    }
}
