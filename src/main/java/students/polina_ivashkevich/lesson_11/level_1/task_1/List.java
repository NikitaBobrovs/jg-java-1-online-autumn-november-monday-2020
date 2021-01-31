package students.polina_ivashkevich.lesson_11.level_1.task_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {
    //Difference in the way data is stored.

//ArrayList is faster in storing and accessing data.
//LinkedList is faster in manipulating data (like add/ remove).


    class ListDemo {
        private java.util.List<String> arrayList = new ArrayList<>();

        private java.util.List<String> linkedList = new LinkedList<>();

        public ListDemo(java.util.List<String> arrayList, java.util.List<String> linkedList) {
            this.arrayList = arrayList;
            this.linkedList = linkedList;
        }

    }
}
