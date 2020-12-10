package students.jana_sergejenko.lesson_6.level_3.task_12;

class ArrayService {
    int[][] createTwoDimensionalArray() {
        int[][] values = new int[4][4];
        return values;
    }

    void generateArray(int[][] values) {
        int value = 1;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                values[i][j] = value++;

            }
        }
    }

    void printArray(int[][] values) {
     for (int[] i : values) {
        for (int j : i) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}

    boolean contains(int[][] values, int numberToSearch) {
        for (int[] i : values) {
            for (int j : i) {
                if (j== numberToSearch)
                    return true;
            }

        }
        return false;

    }
}








