package students.viktors_cesnokovs.lesson_6.level_3.task_12;

public class ArrayService {
    boolean contains(int[] arr, int numberToSearch) {
        for (int i : arr) {
            if (numberToSearch == i) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] array, int numberToSearch) {
        int i = 0;
        for (int arr : array) {
            if (arr == numberToSearch) {
                i += 1;
            }
        }
        return i;
    }

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                count += 1;
            }
        }
        return count;
    }

    void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int a = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = a;
        }
    }

    void sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[left] % 2 != 0) {
                if (arr[right] % 2 == 0) {
                    int t = arr[left];
                    arr[left] = arr[right];
                    arr[right] = t;
                    left++;
                }
                right--;
            } else {
                left++;
            }
        }
    }
}


