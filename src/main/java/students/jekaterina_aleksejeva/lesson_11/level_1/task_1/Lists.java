package students.jekaterina_aleksejeva.lesson_11.level_1.task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Lists {
    public static void main(String[] args) {
        List <String> list = new ArrayList<String>();
        list.add("December");
        list.add("February");
        list.add("January");
        list.add("March");

        System.out.println("Initial list of months: " + list);
        System.out.println("Initial list size: " + list.size());
        System.out.println("Get 1st quarter months: " + list.get(1) + ", " + list.get(2) + ", " + list.get(3) );
        System.out.println("Remove the month outside the 1st quarter: " + list.get(0));
        list.remove(0);
        System.out.println("And sort 1st quarter months by calendar:");
        list.set(0,"January");
        list.set(1,"February");
        System.out.println(list);
        System.out.println("------------------------------------------");

        LinkedList<String> list1 = new LinkedList<String>();
        list1.add(0, "July");
        list1.add(1, "April");
        list1.add(2, "May");

        System.out.println("Initial linked list of months: " + list1);
        System.out.println("Initial list size: " + list1.size());
        System.out.println("Get 2nd quarter months: " + list1.get(1) + ", " + list1.get(2));
        System.out.println("Remove the 1st month which is outside the 2nd quarter: " + list1.get(0));
        list1.removeFirst();
        System.out.println(list1);
        System.out.println("Add last missing month of the 2nd quarter: June");
        list1.addLast("June");
        System.out.println(list1);

    }
/* Difference in ArrayList and LinkedList in how the elements are stored,accessed and manipulated.
 LinkedList is more suitable for manipulations, on the other hand Arraylist supports faster access.
 */
}
