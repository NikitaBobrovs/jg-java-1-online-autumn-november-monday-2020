package students.viktors_cesnokovs.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {
    List<Book> books = new ArrayList<>();

    Book book1 = new Book("A1", "B1");
    Book book2 = new Book("A2", "B2");

    void add() {
        books.add(book1);
        books.add(book2);
    }

    public static void main(String[] args) {
        BookListContainsDemo test = new BookListContainsDemo();
        test.add();

        Book bookInTheList = new Book("A1", "B1");
        boolean containsBook = test.books.contains(bookInTheList);

        Book bookNotInTheList = new Book("A3", "B3");
        boolean notContainsBook = test.books.contains(bookNotInTheList);

        System.out.println(containsBook);
        System.out.println(notContainsBook);
    }

}
