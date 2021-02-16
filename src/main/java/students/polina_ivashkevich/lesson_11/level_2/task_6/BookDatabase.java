package students.polina_ivashkevich.lesson_11.level_2.task_6;

import javax.naming.directory.SearchResult;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface BookDatabase {

    Long save(Book book);

    boolean deleteById(Long bookId);
    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    void findByAuthor(String author);
    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);
    void deleteByTitle(String title);

    List<Book> find(SearchCriteria searchCriteria);
    Set<String> findUniqueAuthors();
    Set<String> findUniqueTitles();
    Set<Book> findUniqueBooks();
     boolean contains(Book book);

     Map<String, List<Book>> getAuthorToBooksMap();
     Map<String, Integer> getEachAuthorBookCount();

    List<Book> find();
}
