package students.polina_ivashkevich.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;

public class BookListInfoDemo{

List<Book> books = new ArrayList<>();

Book book1 = new Book("A1", "T1");
Book book2 = new Book("A2", "T2");

    void addBooks() {
        books.add(book1);
        books.add(book2);
    }

    public static void main(String[] args) {
        BookListInfoDemo demo = new BookListInfoDemo();
        demo.addBooks();

        Book bookInTheList = new Book("A1", "T1");
        boolean containsBook = demo.books.contains(bookInTheList);

        Book bookNotTheList = new Book("A3", "T3");
        boolean notContainsBook = demo.books.contains(bookNotTheList);
        System.out.println(containsBook);
        System.out.println(notContainsBook);
    }
 }
