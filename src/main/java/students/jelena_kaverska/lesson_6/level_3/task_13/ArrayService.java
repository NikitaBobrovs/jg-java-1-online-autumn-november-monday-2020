package students.jelena_kaverska.lesson_6.level_3.task_13;

class ArrayService {

    int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int number : arr) {
            if (number == target) {
                count++;
            }
        }
        return count;
    }
}