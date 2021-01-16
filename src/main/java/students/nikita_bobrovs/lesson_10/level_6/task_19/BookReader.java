package students.nikita_bobrovs.lesson_10.level_6.task_19;

import java.util.List;

public interface BookReader {
    boolean addBook(Book book, List<Book> library);

    boolean removeBook(Book book, List<Book> library);

    void printAllBooks(List<Book> library);

    List<Book> findByAuthor(String author, List<Book> library);

    List<Book> findByTitle(String title, List<Book> library);

    boolean isRead(String title, String author, List<Book> library);

    boolean isNotRead(String title, String author, List<Book> library);

    void printReadBooks(List<Book> library);

    void printNotReadBooks(List<Book> library);
}
