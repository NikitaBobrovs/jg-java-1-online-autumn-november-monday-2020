package students.tatjana_topcilina.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Task4 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 1, 2));
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>(List.of(1, 2, 1, 2, 1, 2));
        System.out.println(list2);
    }
}