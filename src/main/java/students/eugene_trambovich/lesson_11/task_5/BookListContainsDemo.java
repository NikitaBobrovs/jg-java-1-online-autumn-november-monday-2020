package students.eugene_trambovich.lesson_11.task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {

    List<Book> books = new ArrayList<>();

    Book book1 = new Book("A1", "B1");
    Book book2 = new Book("A2", "B2");

    void addBook() {
        books.add(book1);
        books.add(book2);
    }

    public static void main(String[] args) {
        BookListContainsDemo bookListContainsDemo = new BookListContainsDemo();
        bookListContainsDemo.addBook();

        Book bookInTheList = new Book("A1", "B1");
        boolean containsBook = bookListContainsDemo.books.contains(bookInTheList); // должно быть true

        Book bookNotInTheList = new Book("A3", "B3");
        boolean notContainsBook = bookListContainsDemo.books.contains(bookNotInTheList); // должно быть false

    }

}
