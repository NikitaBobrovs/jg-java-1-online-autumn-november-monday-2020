package students.jelena_kaverska.lesson_6.level_3.task_12;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        for (int number : arr) {
            if (number == numberToSearch) {
                return true;
            }
        }
        return false;
    }
}