package students.jelena_kaverska.lesson_11.level_4.task_27;

import java.util.*;

class UniqueWordFinder {

    Set<String> find(String text) {
        String[] arr = text.split(",\\s*");
        return new TreeSet<>(Arrays.asList(arr));
    }
}

class My {
    public static void main(String[] args) {
        String str = "Male, NY, Tokyo, Male, London, NY";
        System.out.println(new UniqueWordFinder().find(str));
    }
}