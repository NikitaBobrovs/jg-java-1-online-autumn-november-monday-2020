package students.tatjana_topcilina.lesson_11.level_2.task_6;

import java.util.List;
import java.util.Optional;

public interface BookDatabase {
    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);
    Optional<Book> findById(Long bookId);
    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String title);
    int countAllBooks();
    boolean deleteByAuthor(String author);
    void deleteByTitle(String title);
}