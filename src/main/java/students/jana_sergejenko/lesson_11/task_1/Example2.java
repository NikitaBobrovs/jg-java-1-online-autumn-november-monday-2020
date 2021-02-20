package students.jana_sergejenko.lesson_11.task_1;

import java.util.LinkedList;

public class Example2 {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("BWM");
        cars.add("Audi");
        cars.add("Subaru");
        cars.add("Volkswgen");
        System.out.println(cars);
    }
}
//ArrayList реализован внутри в виде обычного массива
//Linkedlist реализован в виде связного списка