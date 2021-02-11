package students.viktors_cesnokovs.lesson_11.level_1.task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// LinkedList is better for manipulating data. Fast manipulation because it uses doubly linked list.
// ArrayList is better for storing and accessing data. Slow manipulation because it internally uses an array.
class UtilListDemo {
    public static void main(String[] args) {
        List<String> tl = new ArrayList<String>();
        tl.add("Bottle");
        tl.add("Cap");
        tl.add("Spoon");

        List<String> tl2 = new LinkedList<String>();
        tl2.add("John");
        tl2.add("Jack");
        tl2.add("Marta");
        tl2.add("Marie");

        System.out.println("arraylist : " + tl);
        System.out.println("linkedlist : " + tl2);
    }
}
