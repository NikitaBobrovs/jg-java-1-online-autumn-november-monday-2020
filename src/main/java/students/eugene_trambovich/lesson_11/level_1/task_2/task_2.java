package students.eugene_trambovich.lesson_11.level_1.task_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class task_2 {

    //Списки могут хранить ссылки на обьекты

    List<Integer> integerList = new ArrayList<>();
    List<String> stringList = new ArrayList<>();
    List<LinkedList<String>> linkListMain = new ArrayList<>();
    LinkedList<String> linkedList = new LinkedList<>();


    void addInteger() {
        integerList.add(7);
    }

    void addString() {
        stringList.add("test");
    }

    void addLinkedList() {
        linkListMain.add(linkedList);
    }

}
