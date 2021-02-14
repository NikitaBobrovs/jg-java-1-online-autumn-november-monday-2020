package students.tatjana_topcilina.lesson_11.level_1.task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return !(!Objects.equals(title, book.title) || !Objects.equals(author, book.author));
    }

    public int hashCode() {
        return Objects.hash(title, author);
    }
}


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
