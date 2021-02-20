package students.polina_ivashkevich.lesson_11.leve_1.task_3;


import java.util.ArrayList;

public class IntegerListDemo<List> {
    java.util.List<Integer> integerList = new ArrayList<>();

    void addToList() {
        int a = 5;
        integerList.add(a);
        integerList.add(8);
        integerList.add(32);
        integerList.add(76);

    }
    int getListSize() {
        return integerList.size();
    }
        void deleteByObjectValueFromList() {
            integerList.remove(Integer.valueOf(32));
        }
        void deleteByObjectIndex() {
        integerList.remove(3);
    }
    void removeByIteratingOverList(int valueToDelete) {
        integerList.removeIf(integer -> integer == (valueToDelete));
    }
    boolean listEmptyOrNot() {
     return integerList.isEmpty();
    }
    void printAllList() {
        //integerList.forEach(integer -> System.out.println(integer));
        integerList.forEach(System.out::println);
    }
}
