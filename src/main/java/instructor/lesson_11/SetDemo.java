package instructor.lesson_11;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> strings = new HashSet<>();
        System.out.println(strings);

        strings.add("hello");
        strings.add("foobar");
        strings.add("hello");
        strings.add("world");
        strings.add("foobar");
        strings.add("hello");

        System.out.println(strings);
    }
}
