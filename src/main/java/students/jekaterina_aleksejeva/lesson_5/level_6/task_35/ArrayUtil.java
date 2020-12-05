package students.jekaterina_aleksejeva.lesson_5.level_6.task_35;

class ArrayUtil {

    public int findMaxNumber(int[] array) {
        int maxNum = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            maxNum = Math.max(maxNum, array[i]);

        }
        return maxNum;
    }
}
