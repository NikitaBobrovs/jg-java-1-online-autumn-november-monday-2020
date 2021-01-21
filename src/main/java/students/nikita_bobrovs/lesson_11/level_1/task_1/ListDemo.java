package students.nikita_bobrovs.lesson_11.level_1.task_1;

//Difference in the way data is stored.

//ArrayList is faster in storing and accessing data.
//LinkedList is faster in manipulating data (like add/ remove).

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListDemo {
    private List<String> arrayList = new ArrayList<>();

    private List <String> linkedList = new LinkedList<>();

    public ListDemo(List<String> arrayList, List<String> linkedList) {
        this.arrayList = arrayList;
        this.linkedList = linkedList;
    }
}
