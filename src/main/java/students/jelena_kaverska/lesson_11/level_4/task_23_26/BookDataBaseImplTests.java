package students.jelena_kaverska.lesson_11.level_4.task_23_26;

import java.util.HashSet;
import java.util.Set;

class BookDataBaseImplTests {
    private BookDatabase bookDatabase;

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    //task 23
    void testUniqueAuthors() {
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<String> exp = Set.of("Agatha Christie", "Ayn Rand");
        Set<String> act = bookDatabase.findUniqueAuthors();
        System.out.println("Test unique authors 2: " + printResults(exp.equals(act)));
    }

    //task 23
    void testNoAuthors() {
        bookDatabase = new BookDatabaseImpl();
        Set<String> exp = new HashSet<>();
        Set<String> act = bookDatabase.findUniqueAuthors();
        System.out.println("Test no authors: " + printResults(exp.equals(act)));
    }

    //task 23
    void testUniqueAuthors1() {
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        Set<String> exp = Set.of("Agatha Christie", "Ayn Rand");
        Set<String> act = bookDatabase.findUniqueAuthors1();
        System.out.println("Test uniques authors: " + printResults(exp.equals(act)));
    }

    //task 24
    void testUniqueTitles() {
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        Book book4 = new Book("Agatha Christie", "Poirot 1");
        bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        Set<String> exp = Set.of("Poirot 1", "Poirot 2", "Atlas Shrugged");
        Set<String> act = bookDatabase.findUniqueTitles();
        System.out.println("Test unique titles: " + printResults(exp.equals(act)));
    }

    //task 24
    void testUniqueTitles1() {
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        Book book4 = new Book("Agatha Christie", "Poirot 1");
        bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        Set<String> exp = Set.of("Poirot 1", "Poirot 2", "Atlas Shrugged");
        Set<String> act = bookDatabase.findUniqueTitles1();
        System.out.println("Test unique titles 2: " + printResults(exp.equals(act)));
    }

    //25 task
    void testUniqueBooks() {
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        Book book4 = new Book("Ayn Rand", "Atlas Shrugged");
        bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        bookDatabase.save(book4);
        Set<Book> exp = Set.of(book1, book2, book3);
        Set<Book> act = bookDatabase.findUniqueBooks();
        System.out.println("Test unique books: " + printResults(exp.equals(act)));
    }

    //26 task
    void testContains() {
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean act = bookDatabase.contains(book1);
        System.out.println("Test contains: " + printResults(act));
    }

    //26 task
    void testContains1() {
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean act = bookDatabase.contains1(book1);
        System.out.println("Test contains 1: " + printResults(act));
    }

    //26 task
    void testContainsNo() {
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean act = bookDatabase.contains(new Book("Turgenev", "Mumu"));
        System.out.println("Test contains: " + printResults(!act));
    }

    //26 task
    void testContainsNo1() {
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);
        boolean act = bookDatabase.contains1(new Book("Turgenev", "Mumu"));
        System.out.println("Test contains 1: " + printResults(!act));
    }

    public static void main(String[] args) {
        BookDataBaseImplTests tests = new BookDataBaseImplTests();
        tests.testUniqueAuthors();
        tests.testUniqueAuthors1();
        tests.testNoAuthors();
        tests.testUniqueTitles();
        tests.testUniqueTitles1();
        tests.testUniqueBooks();
        tests.testContains();
        tests.testContains1();
        tests.testContainsNo();
        tests.testContainsNo1();
    }
}