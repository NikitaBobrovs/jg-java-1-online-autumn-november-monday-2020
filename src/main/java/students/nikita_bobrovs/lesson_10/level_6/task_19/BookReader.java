package students.nikita_bobrovs.lesson_10.level_6.task_19;

import java.util.List;

public interface BookReader {
    boolean addBook(Book book);

    boolean removeBook(Book book);

    List<Book> getAllBooks();

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    boolean setRead(String title, String author);

    boolean setNotRead(String title, String author);

    List<Book> getReadBooks();

    List<Book> getNotReadBooks();
}
