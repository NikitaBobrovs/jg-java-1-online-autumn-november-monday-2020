package students.jelena_kaverska.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(9);
        ints.add(2);
        ints.add(20);
        ints.add(0, 5);
        System.out.println(ints);
        System.out.println(ints.size());
        ints.remove(Integer.valueOf(9));
        System.out.println(ints);
        ints.remove(2);
        System.out.println(ints);
        System.out.println(ints.isEmpty());
        for (Integer i : ints) {
            System.out.println(i);
        }
        ints.forEach(i -> System.out.println(i));
        ints.forEach(System.out::println);

    }
}