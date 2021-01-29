package students.jelena_kaverska.lesson_11.level_6.task_30_38;

import java.util.List;
import java.util.Map;
import java.util.Optional;

interface BookDatabase {

    Long save(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    boolean delete(Long id);

    boolean delete(Book book);

    int countAllBooks();

    Map<String, List<Book>> getAuthorToBooksMap();

    Map<String, List<Book>> getAuthorToBooksMap1();

    List<Book> getAllBooks();

    Map<String, Integer> getEachAuthorBookCount();

    Map<String, Long> getEachAuthorBookCount1();

}