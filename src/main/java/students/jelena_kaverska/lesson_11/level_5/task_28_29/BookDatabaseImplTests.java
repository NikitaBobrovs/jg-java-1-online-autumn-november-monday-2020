package students.jelena_kaverska.lesson_11.level_5.task_28_29;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BookDatabaseImplTests {
    private BookDatabaseImpl impl;

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testGrouping() {
        impl = new BookDatabaseImpl();
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book4 = new Book("Turgenev", "Mumu");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        impl.save(book1);
        impl.save(book2);
        impl.save(book3);
        impl.save(book4);
        Map<String, List<Book>> exp = new HashMap<>();
        exp.put("Agatha Christie", List.of(book1, book2));
        exp.put("Turgenev", List.of(book4));
        exp.put("Ayn Rand", List.of(book3));
        Map<String, List<Book>> act = impl.getAuthorToBooksMap();
        System.out.println("Test grouping by author: " + printResults(exp.equals(act)));
    }

    void testGrouping1() {
        impl = new BookDatabaseImpl();
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book4 = new Book("Turgenev", "Mumu");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        impl.save(book1);
        impl.save(book2);
        impl.save(book3);
        impl.save(book4);
        Map<String, List<Book>> exp = new HashMap<>();
        exp.put("Agatha Christie", List.of(book1, book2));
        exp.put("Turgenev", List.of(book4));
        exp.put("Ayn Rand", List.of(book3));
        Map<String, List<Book>> act = impl.getAuthorToBooksMap1();
        System.out.println("Test grouping by author: " + printResults(exp.equals(act)));
    }

    void testCounting() {
        impl = new BookDatabaseImpl();
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book4 = new Book("Turgenev", "Mumu");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        impl.save(book1);
        impl.save(book2);
        impl.save(book3);
        impl.save(book4);
        Map<String, Integer> exp = new HashMap<>();
        exp.put("Agatha Christie", 2);
        exp.put("Turgenev", 1);
        exp.put("Ayn Rand", 1);
        Map<String, Integer> act = impl.getEachAuthorBookCount();
        System.out.println("Test counting each author: " + printResults(exp.equals(act)));

    }

    public static void main(String[] args) {
        BookDatabaseImplTests test = new BookDatabaseImplTests();
        test.testGrouping();
        test.testGrouping1();
        test.testCounting();
    }
}