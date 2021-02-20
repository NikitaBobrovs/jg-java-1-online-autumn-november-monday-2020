package students.viktors_cesnokovs.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);

        System.out.println("List : " + integerList);
        integerList.add(0, 0);
        integerList.add(8, 8);
        System.out.println("First and last added : " + integerList);
        System.out.println("List size : " + integerList.size());
        integerList.remove(Integer.valueOf(2));
        integerList.remove(6);
        System.out.println("Remove element with/without index : " + integerList);
        System.out.println(integerList.isEmpty());
        for (Integer x : integerList) {
            System.out.println(x);
        }
        integerList.forEach(x -> System.out.println(x));
        integerList.forEach(System.out::println);
    }
}
