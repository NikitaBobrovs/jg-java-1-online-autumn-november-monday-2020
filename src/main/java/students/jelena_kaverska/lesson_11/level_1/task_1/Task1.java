package students.jelena_kaverska.lesson_11.level_1.task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Task1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("book");
        strings.add("cat");
        strings.add("apple");
        System.out.println(strings);

        List<String> strings1 = new LinkedList<>();
        strings1.add("book");
        strings1.add("cat");
        strings1.add("apple");
        System.out.println(strings1);
    }
}
//difference: internal workings - implementation, performance, storage, accessing data, etc.