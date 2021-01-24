package students.eugene_trambovich.lesson_11.task_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//реализации интерфейса java.util.List могут хранить одинаковые элементы

class Task_4 {
    List<String> stringList = new ArrayList<>();
    List<Integer> integerList = new LinkedList<>();

    void addToList() {
        stringList.add("test");
        stringList.add("test");
        integerList.add(7);
        integerList.add(7);
    }

    public static void main(String[] args) {
        Task_4 task_4 = new Task_4();
        task_4.addToList();
        task_4.stringList.forEach(System.out::println);
        task_4.integerList.forEach(System.out::println);
    }
}
