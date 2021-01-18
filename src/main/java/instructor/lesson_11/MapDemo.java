package instructor.lesson_11;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, Integer> words = new HashMap<>();
        words.put("Hello", 5);
        words.put("World", 3);
        words.put("Monday", 7);

        System.out.println("words.get(\"Hello\") = " + words.get("Hello"));
        System.out.println("words.get(\"World\") = " + words.get("World"));
        System.out.println("words.get(\"Monday\") = " + words.get("Monday"));

        words.remove("World");

        System.out.println(words);
        System.out.println("words.size() = " + words.size());
        System.out.println("words.isEmpty() = " + words.isEmpty());

        words.clear();
        System.out.println("words.size() = " + words.size());
        System.out.println("words.isEmpty() = " + words.isEmpty());

    }
}
