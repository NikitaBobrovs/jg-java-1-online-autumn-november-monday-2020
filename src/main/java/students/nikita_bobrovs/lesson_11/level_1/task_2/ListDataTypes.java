package students.nikita_bobrovs.lesson_11.level_1.task_2;

//Can store objects

import java.util.ArrayList;
import java.util.List;

class ListDataTypes {
    private List<Integer> integerList = new ArrayList<>(); // String, Classes etc

    private void addToIntegerList(){
        integerList.add(5);
        integerList.add(36);
    }

}
    //Can also store list in list

class ListInList{
    private List<ArrayList<String>> mainList = new ArrayList<>();
    private ArrayList<String> list1 = new ArrayList<>();
    private ArrayList<String> list2 = new ArrayList<>();

    private void addToStringLists(){
        list1.add("A");
        list1.add("B");
        list2.add("C");
        list2.add("D");
    }

    private void addToListOfLists(){
        mainList.add(list1);
        mainList.add(list2);
    }
}
