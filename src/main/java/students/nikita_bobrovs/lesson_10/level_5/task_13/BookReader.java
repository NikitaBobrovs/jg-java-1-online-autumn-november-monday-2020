package students.nikita_bobrovs.lesson_10.level_5.task_13;

import java.util.List;

public interface BookReader {
    boolean addBook(Book book);

    boolean removeBook(Book book);

    List<Book> getAllBooks();

    List<Book> findByAuthorFullName(String author);

    List<Book> findByAuthorPartName(String author);
}
