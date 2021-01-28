package students.jelena_kaverska.lesson_11.level_4.task_23_26;

import java.util.List;
import java.util.Set;

interface BookDatabase {
    Long save(Book book);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueAuthors1();

    Set<String> findUniqueTitles();

    Set<String> findUniqueTitles1();

    Set<Book> findUniqueBooks();

    List<Book> getAllBooks();

    boolean contains(Book book);

    boolean contains1(Book book);

}