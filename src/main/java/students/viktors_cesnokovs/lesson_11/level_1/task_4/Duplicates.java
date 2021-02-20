package students.viktors_cesnokovs.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Duplicates {
    public static void main(String[] args) {
        List<Integer> integerList1 = new ArrayList<>(Arrays.asList(1, 1, 3, 3, 5, 5, 8, 8));
        List<Integer> integerList2 = new LinkedList<>(List.of(1, 1, 3, 3, 5, 5, 8, 8));

        System.out.println(integerList1);
        System.out.println(integerList2);
    }
}
