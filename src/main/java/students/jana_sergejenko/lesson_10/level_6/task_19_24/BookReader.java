package students.jana_sergejenko.lesson_10.level_6.task_19_24;

import java.util.Optional;

public interface BookReader {
    boolean save(Book book);

    void printAll();

    boolean findByTitleAndAuthor(String title, String author);

    boolean delete(Book book);

    Optional<Book> findByAuthor(String author);

    Optional<Book> findByTitle(String title);

    boolean setMarkRead(Book book);

    boolean setMarkNotRead(Book book);

    Book allRead();

    Book allNotRead();
}