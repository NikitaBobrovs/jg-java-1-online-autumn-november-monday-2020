package students.jelena_kaverska.lesson_11.level_4.task_23_26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

class BookDatabaseImpl implements BookDatabase {
    private List<Book> books = new ArrayList<>();
    private Long bookId = 0L;

    @Override
    public Long save(Book book) {
        bookId++;
        Book copy = new Book(bookId, book.getAuthor(), book.getTitle());
        books.add(copy);
        return bookId;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        return books.stream()
                .map(Book::getAuthor)
                .collect(toSet());
    }

    @Override
    public Set<String> findUniqueAuthors1() {
        Set<String> authors = new HashSet<>();
        for (Book book : books) {
            authors.add(book.getAuthor());
        }
        return authors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        return books.stream()
                .map(Book::getTitle)
                .collect(toSet());
    }

    @Override
    public Set<String> findUniqueTitles1() {
        Set<String> titles = new HashSet<>();
        for (Book book : books) {
            titles.add(book.getTitle());
        }
        return titles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(books);
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public boolean contains(Book book) {
        return books.stream()
                .anyMatch(b -> b.equals(book));
    }

    @Override
    public boolean contains1(Book book) {
        return books.contains(book);
    }
}