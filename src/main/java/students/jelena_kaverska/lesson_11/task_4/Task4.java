package students.jelena_kaverska.lesson_11.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Task4 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 3, 8));
        System.out.println(ints);

        List<Integer> ints1 = new ArrayList<>(List.of(1, 2, 1, 3, 3, 8));
        System.out.println(ints1);
    }
}