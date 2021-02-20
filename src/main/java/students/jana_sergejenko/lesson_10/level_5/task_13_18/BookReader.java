package students.jana_sergejenko.lesson_10.level_5.task_13_18;

import java.util.Optional;

public interface BookReader {
    boolean save(Book book);

    void printAll();

    boolean findByTitleAndAuthor(String title, String author);

    boolean delete(Book book);

    Optional<Book> findByAuthor(String author);

}
