package students.nikita_bobrovs.lesson_10.level_5.task_13;

import java.util.List;

public interface BookReader {
    boolean addBook(Book book, List<Book> library);

    boolean removeBook(Book book, List<Book> library);

    void printAllBooks(List<Book> library);

    List<Book> findByAuthorFullName(String author, List<Book> library);

    List<Book> findByAuthorPartName(String author, List<Book> library);
}
