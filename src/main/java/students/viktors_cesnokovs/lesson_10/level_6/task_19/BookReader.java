package students.viktors_cesnokovs.lesson_10.level_6.task_19;

import java.util.List;

public interface BookReader {
    boolean addBook(Book book);

    boolean removeBook(Book book);

    List<Book> getAllBooks();

    List<Book> findByAuthorFullName(String author);

    List<Book> findByTitle(String title);

    boolean setRead(String title, String author);

    boolean setNotRead(String title, String author);

    List<Book> readBooks();

    List<Book> notReadBooks();
}
