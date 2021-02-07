package students.jekaterina_aleksejeva.lesson_11.level_5.task_28;

import java.util.List;
import java.util.Map;

interface BookDatabase {

    Long save(Book book);

    List<Book> getBookList();

    Map<String, List<Book>> getAuthorToBooksMap();

    Map<String, Integer> getEachAuthorBookCount();

}



