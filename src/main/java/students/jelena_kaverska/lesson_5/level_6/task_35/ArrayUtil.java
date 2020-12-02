package students.jelena_kaverska.lesson_5.level_6.task_35;

class ArrayUtil {
    void printArrayToConsole(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }

    int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}