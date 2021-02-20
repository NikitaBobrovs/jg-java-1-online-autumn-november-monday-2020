package students.jelena_kaverska.lesson_11.level_5.task_28_29;

import java.util.List;
import java.util.Map;

interface BookDatabase {

    Long save(Book book);

    Map<String, List<Book>> getAuthorToBooksMap();

    Map<String, List<Book>> getAuthorToBooksMap1();

    List<Book> getAllBooks();

    Map<String, Integer> getEachAuthorBookCount();

    Map<String, Long> getEachAuthorBookCount1();

}