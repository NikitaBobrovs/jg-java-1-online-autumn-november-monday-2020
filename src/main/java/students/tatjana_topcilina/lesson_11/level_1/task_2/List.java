package students.tatjana_topcilina.lesson_11.level_1.task_2;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Potter"));
        Book book = new Book("Harry");
        books.add(book);
        for (Book c: books){
            System.out.println(c.name + " ");
        }

        ArrayList<java.io.Serializable> list = new ArrayList<>();
        list.add(1);
        list.add("paper");
        list.add("white");
        list.add(1000);
        System.out.println(list);
    }
}
class Book {
    String name;

    Book(String name) {
        this.name =name;
    }
}

//ArrayList elements may by different types/same type