package students.eugene_trambovich.lesson_11.task_3;

import java.util.LinkedList;
import java.util.List;

class IntegerListDemo {
    List<Integer> integerList = new LinkedList<>();
    int element = 7;

    void addToList() {
        integerList.add(3);
        integerList.add(element);
    }

    int getListSize() {
        return integerList.size();
    }

    void deleteElementByValue() {
        integerList.remove(Integer.valueOf(3));
    }

    void deleteElementByIndex() {
        integerList.remove(0);
    }

    boolean CheckIfListIsEmpty() {
        return integerList.isEmpty();
    }

    void PrintAllListElements() {
        integerList.forEach(System.out::println);
    }
}
