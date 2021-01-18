package instructor.lesson_11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List<String> strings = new LinkedList<>();
        System.out.println(strings);

        strings.add("Buy milk");
        strings.add("Finish homework");
        strings.add("Take a walk");

        System.out.println(strings);

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).contains("Take")) {
                System.out.println(i + ": " + strings.get(i));
            }
        }

        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println("strings.get(0) = " + strings.get(0));
        System.out.println("strings.get(1) = " + strings.get(1));
        System.out.println("strings.get(2) = " + strings.get(2));

        System.out.println("strings.size() = " + strings.size());
        System.out.println("strings.isEmpty() = " + strings.isEmpty());

        strings.remove("Buy milk");

        System.out.println(strings);

        System.out.println("strings.size() = " + strings.size());
        System.out.println("strings.isEmpty() = " + strings.isEmpty());

        strings.clear();

        System.out.println("strings.size() = " + strings.size());
        System.out.println("strings.isEmpty() = " + strings.isEmpty());

    }
}
