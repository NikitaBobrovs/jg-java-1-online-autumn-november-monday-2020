package students.viktors_cesnokovs.lesson_11.level_2.task_6_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class BookDatabaseImpl implements BookDatabase {
    private final List<Book> books = new ArrayList<>();
    private Long bookId = 0L;

    @Override
    public Long save(Book book) {
        bookId++;
        Book copy = new Book(bookId, book.getAuthor(), book.getTitle());
        books.add(copy);
        return bookId;
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean delete(Book book) {
        return books.removeIf(b -> b.equals(book));
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        return books.stream()
                .filter(b -> b.getId().equals(bookId))
                .findAny();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<Book> findByTitle(String title) {
        return books.stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        books.removeIf(book -> book.getAuthor().equalsIgnoreCase(author));
    }

    @Override
    public void deleteByTitle(String title) {
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    public List<Book> getBooks() {
        return books;
    }
}
