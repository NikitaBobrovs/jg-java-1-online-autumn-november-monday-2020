package instructor.lesson_14;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toSet;

class BookDemo {

    public static void main(String[] args) {

        List<Book> books = List.of(
                new Book("1", "Title A", "Author X"),
                new Book("2", "Title B", "Author X"),
                new Book("3", "Title C", "Author Y"),
                new Book("4", "Title D", "Author Y"),
                new Book("5", "Title E", "Author Z"),
                new Book("6", "Title F", "Author Z"),
                new Book("7", "Title G", "Author X"),
                new Book("8", "Title H", "Author Y"),
                new Book("9", "Title I", "Author X"),
                new Book("10", "Title J", "Author Z"),
                new Book("11", "Title J", "Author Z")
        );

        Map<String, List<Book>> mapById = books.stream().collect(groupingBy(Book::getId));
        System.out.println(mapById);

        System.out.println();

        Map<String, Set<String>> bookTitlesByAuthor = books.stream().collect(groupingBy(Book::getAuthor, mapping(Book::getTitle, toSet())));
        System.out.println(bookTitlesByAuthor);

        System.out.println();

        Map<String, Long> booksByAuthor = books.stream().collect(groupingBy(Book::getAuthor, counting()));
        System.out.println("booksByAuthor = " + booksByAuthor);
    }
}

class Book {

    private final String id;
    private final String title;
    private final String author;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
