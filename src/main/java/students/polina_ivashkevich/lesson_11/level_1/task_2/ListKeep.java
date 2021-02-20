package students.polina_ivashkevich.lesson_11.level_1.task_2;

import java.util.ArrayList;
import java.util.List;

public class ListKeep {

    //Can store objects


    class ListDataTypes {
        private List<Integer> integerList = new ArrayList<>(); // String, Classes etc

        private void addToIntegerList(){
            integerList.add(8);
            integerList.add(25);
        }

    }
    //Can also store list in list

    class ListInList{
        private List<ArrayList<String>> mainList = new ArrayList<>();
        private ArrayList<String> list1 = new ArrayList<>();
        private ArrayList<String> list2 = new ArrayList<>();

        private void addToStringLists(){
            list1.add("Milk");
            list1.add("Broad");
            list2.add("Cereals");
            list2.add("Chocolate");
        }

        private void addToListOfLists(){
            mainList.add(list1);
            mainList.add(list2);
        }
    }
}
