package students.jana_sergejenko.lesson_6.level_3.task_12;

class ArrayService {
    int[][] createTwoDimensionalArray() {
        int[][] values = new int[4][4];
        return values;
    }

    void generateArray(int[][] array) {

        int value = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = value++;
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

    boolean contains(int[][] values, int numberToSearch) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (values[i][j] == numberToSearch)
                    return true;
            }

        }
        return false;

    }
}








