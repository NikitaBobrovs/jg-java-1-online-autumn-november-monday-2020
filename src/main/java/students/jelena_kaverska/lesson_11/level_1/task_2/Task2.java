package students.jelena_kaverska.lesson_11.level_1.task_2;

import java.util.ArrayList;
import java.util.List;

class Task2 {
    public static void main(String[] args) {
        //reference types only or primitive wrapper classes objects
        List<Integer> ints = new ArrayList<>();
        ints.add(1);

        List<Book> books = new ArrayList<>();
        books.add(new Book());
    }
}