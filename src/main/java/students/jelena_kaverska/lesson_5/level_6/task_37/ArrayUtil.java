package students.jelena_kaverska.lesson_5.level_6.task_37;

class ArrayUtil {
    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}