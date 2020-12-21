package students.eugene_trambovich.lesson_6.level_3.Task_12_and_13;

public class ArrayService {

    boolean contains(int[] array, int numberToSearch) {
        for (int number : array) {
            if (number == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] array, int numberToCheck) {
        int count = 0;
        for (int number : array) {
            if (number == numberToCheck) {
                count += 1;
            }
        }
        return count;
    }
}
