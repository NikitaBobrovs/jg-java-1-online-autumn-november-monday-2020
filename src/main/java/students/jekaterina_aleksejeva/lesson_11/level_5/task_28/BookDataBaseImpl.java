package students.jekaterina_aleksejeva.lesson_11.level_5.task_28;

import java.util.*;
import java.util.stream.Collectors;

class BookDataBaseImpl implements BookDatabase {
    List<Book> bookList = new ArrayList<>();
    Long bookId = 0L;

    @Override
    public Long save(Book book) {
        bookList.add(book);
        bookId++;
        book.setId(bookId);
        return bookId;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public List<Book> findByAuthor(String author) {
        return bookList.stream().filter(book -> book.getAuthor().equals(author)).collect(Collectors.toList());

    }

    public Set<String> findUniqueAuthors() {
        return bookList.stream().map(Book::getAuthor).collect(Collectors.toSet());
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorMap = new HashMap<>();
        for (String keyAuthor : findUniqueAuthors()) {
            authorMap.put(keyAuthor, findByAuthor(keyAuthor));
        }
        return authorMap;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> authorBookCount = new HashMap<>();
        for (String keyAuthor : findUniqueAuthors()) {
            authorBookCount.put(keyAuthor, findByAuthor(keyAuthor).size());
        }
        return authorBookCount;
    }

}

class NewNewDemo {

    public static void main(String[] args) {
        BookDataBaseImpl demo = new BookDataBaseImpl();
        demo.save(new Book("aa", "bb", "11"));
        demo.save(new Book("cc", "dd", "22"));
        demo.save(new Book("aa", "ff", "55"));
        demo.save(new Book("gg", "ff", "11"));
        demo.save(new Book("gg", "ff", "11"));
        System.out.println("Book list print out: ");
        System.out.println(demo.getBookList());
        System.out.println("Get map by key author:");
        System.out.println(demo.getAuthorToBooksMap());
        System.out.println("Get map with books count by key author: ");
        System.out.println(demo.getEachAuthorBookCount());
    }
}

class NewTest {
    public static void main(String[] args) {
        NewTest test = new NewTest();
        test.doneAuthorBookMap();
        test.doneAuthorAndBookCountMap();
    }

    BookDataBaseImpl database2 = new BookDataBaseImpl();

    BookDataBaseImpl database = new BookDataBaseImpl();
    Book b1 = new Book("k", "l", "123");
    Book b2 = new Book("k", "c", "888");
    Book b3 = new Book("m", "n", "368");
    Book b4 = new Book("m", "p", "455");

    boolean checkBooleanTest(boolean expectedResult, boolean actualResult) {
        return Objects.equals(expectedResult, actualResult);
    }

    void doneAuthorBookMap() {
        String scenario = "Map of books created by Author k and by Author m = ";
        database2.save(b1);
        database2.save(b2);
        database2.save(b3);
        Map<String, List<Book>> expected = new HashMap<>();
        expected.put("k", List.of(b1, b2));
        expected.put("m", List.of(b3));
        Map<String, List<Book>> actual = database2.getAuthorToBooksMap();
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void doneAuthorAndBookCountMap() {
        String scenario = "Map of books created by each Author & number of books written by him = ";
        database2.save(b4);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("k", 2);
        expected.put("m", 2);
        Map<String, Integer> actual = database2.getEachAuthorBookCount();
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

}