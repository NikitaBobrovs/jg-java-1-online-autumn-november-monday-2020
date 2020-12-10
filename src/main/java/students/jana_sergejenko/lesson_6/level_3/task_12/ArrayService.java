package students.jana_sergejenko.lesson_6.level_3.task_12;

class ArrayService {
    int count;

    int[][] createTwoDimensionalArray() {
        int[][] values = {
                {1, 2, 3, 4},
                {2, 2, 3, 3},
                {3, 4, 5, 6},
                {4, 4, 5, 6}};
        return values;
    }
    //void generateArray(int[][] values) {
    //int value = 1;
    //for (int i = 0; i < values.length; i++) {
    // for (int j = 0; j < values.length; j++) {
    ///  values[i][j] = value++;
    // }

    void printArray(int[][] values) {
        for (int[] i : values) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //estj li sovpadenija
    boolean contains(int[][] values, int numberToSearch) {
        for (int[] i : values) {
            for (int j : i) {
                if (j == numberToSearch)
                    return true;
            }

        }
        return false;

    }

    //skoljko sovpadenij
    int countOccurrences(int[][] values, int numberToSearch) {
        int k = 0;
        for (int[] i : values) {
            for (int j : i) {
                if (j == numberToSearch) {
                    k++;
                }
            }
        }
        return k;
    }

    //zamena zna4enija po zadanim koordinatam x i y
    boolean replaceElementByCoordinate(int[][] values, int x, int y, int newNumber) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                values[x][y] = newNumber;
                return true;
            }

        }
        return false;
    }

    //zamena zna4enija pervogo elementa massiva
    boolean replaceFirst(int[][] values, int numberToReplace, int newNumber) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (values[i][j] == numberToReplace) {
                    values[i][j] = newNumber;
                    return true;
                }
            }
            break;
        }
        return false;
    }

    //zamena vseh najdennih zna4enij na newNumber
    int replaceAll(int[][] values, int numberToReplace, int newNumber) {

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if (values[i][j] == numberToReplace) {
                    values[i][j] = newNumber;
                    count++;
                }
            }

        }
        return count;
    }

    //revert
    void revert(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            int[] reversed = new int[values[i].length];
            for (int j = 0; j < values[i].length; j++) {
                reversed[reversed.length - 1 - j] = values[i][j];
            }
            values[i] = reversed;
        }
    }

    //sortirovka po strokam
    void sort(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                for (int k = 0; k < values[i].length - j - 1; k++) {
                    if (values[i][k] > values[i][k + 1]) {
                        int t = values[i][k];
                        values[i][k] = values[i][k + 1];
                        values[i][k + 1] = t;
                    }
                }
            }
        }
    }
}









