package students.jekaterina_aleksejeva.lesson_11.level_4.task_23;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class BookDatabaseImplNewTest {
    public static void main(String[] args) {
        BookDatabaseImplNewTest test = new BookDatabaseImplNewTest();
        test.foundOneUniqueAuthor();
        test.foundAllUniqueAuthors();
        test.foundOneUniqueTitle();
        test.foundAllUniqueTitles();
        test.foundAllUniqueBooks();
        test.containsBook();
        test.containsNoBook();

    }

    BookDatabaseImpl database1 = new BookDatabaseImpl();
    Book book1 = new Book("123", "111", "122");
    Book book2 = new Book("123", "111", "124");
    Book book3 = new Book("348", "111", "132");
    Book book4 = new Book("000", "111", "122");
    Book book5 = new Book("000", "555", "122");
    Book book6 = new Book("000", "555", "122");

    boolean checkBooleanTest(boolean expectedResult, boolean actualResult) {
        return Objects.equals(expectedResult, actualResult);
    }

    void foundOneUniqueAuthor() {
        String scenario = "Found one unique author = ";
        database1.save(book1);
        database1.save(book2);
        Set<String> expected = Set.of("123");
        Set<String> actual = database1.findUniqueAuthors();
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void foundAllUniqueAuthors() {
        String scenario = "Found all unique authors = ";
        database1.save(book3);
        database1.save(book4);
        Set<String> expected = Set.of("123", "348", "000");
        Set<String> actual = database1.findUniqueAuthors();
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void foundOneUniqueTitle() {
        String scenario = "Found one unique title = ";
        Set<String> expected = Set.of("111");
        Set<String> actual = database1.findUniqueTitles();
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void foundAllUniqueTitles() {
        String scenario = "Found all unique titles = ";
        database1.save(book5);
        Set<String> expected = Set.of("111", "555");
        Set<String> actual = database1.findUniqueTitles();
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void foundAllUniqueBooks() {
        String scenario = "Found all unique books = ";
        database1.save(book6);
        Set<Book> expected = Set.of(book1, book2, book3, book4, book5);
        Set<Book> actual = database1.findUniqueBooks();
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void containsBook() {
        String scenario = "Book list contains searched book = ";
        if (checkBooleanTest(true, database1.contains(book3))) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void containsNoBook() {
        String scenario = "Book list contains no searched book = ";
        if (checkBooleanTest(false, database1.contains(new Book("888", "999", "aaa")))) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }


}
