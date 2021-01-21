package students.nikita_bobrovs.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    List<Integer> integerList = new ArrayList<>();

    void addToList() {
        int b = 3;
        integerList.add(b);
        integerList.add(5);
        integerList.add(10);
        integerList.add(15);
    }

    int getListSize() {
        return integerList.size();
    }

    void deleteByObjectValueFromList() {
        integerList.remove(Integer.valueOf(10));
    }

    void deleteByObjectIndex() {
        integerList.remove(2);
    }

    void removeByIteratingOverList(int valueToDelete) {
        integerList.removeIf(integer -> integer == (valueToDelete));
    }

    boolean listEmptyOrNot() {
        return integerList.isEmpty();
    }

    void printAllList() {
        //  integerList.forEach(integer -> System.out.println(integer));

        integerList.forEach(System.out::println); //Thank you IDE ;D
    }
}
