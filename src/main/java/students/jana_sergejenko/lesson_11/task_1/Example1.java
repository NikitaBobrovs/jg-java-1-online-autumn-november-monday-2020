package students.jana_sergejenko.lesson_11.task_1;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BWM");
        cars.add("Audi");
        cars.add("Subaru");
        cars.add("Volkswgen");
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
