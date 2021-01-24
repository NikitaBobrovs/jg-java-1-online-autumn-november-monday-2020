package students.jana_sergejenko.lesson_10.level_6.task_19;

public interface BookReader {
    boolean save(Book book);

    void printAll();

    boolean findByTitleAndAuthor(String title, String author);

    boolean delete(Book book);

    Book findByAuthor(String author);

    Book findByAuthor2(String author);

    Book findByTitle(String title);
}