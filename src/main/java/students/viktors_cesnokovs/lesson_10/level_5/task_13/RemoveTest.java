package students.viktors_cesnokovs.lesson_10.level_5.task_13;

import java.util.ArrayList;
import java.util.List;

class RemoveTest {
    public static void main(String[] args) {
        RemoveTest removeTest = new RemoveTest();
        removeTest.test1();
        removeTest.test2();
        removeTest.test3();
    }

    private String result(boolean test) {
        if (test) {
            return "PASSED";
        } else
            return "FAILED";
    }

    void test1() {
        BookReaderImpl bookReader = new BookReaderImpl();
        List<Book> expected = new ArrayList<>();

        Book book1 = new Book("Metro 2033", "Dmitrij Gluhovskij");
        Book book2 = new Book("Florentijka", "Djuljeta Benconi");

        expected.add(book1);
        bookReader.getLibrary().add(book1);
        bookReader.getLibrary().add(book2);
        bookReader.removeBook(book2);

        System.out.println("Remove book test (YES) : " + result(expected.equals(bookReader.getLibrary())));
    }

    void test2() {
        BookReaderImpl bookReader = new BookReaderImpl();
        List<Book> expected = new ArrayList<>();

        Book book1 = new Book("Metro 2033", "Dmitrij Gluhovskij");
        Book book2 = new Book("Florentijka", "Djuljeta Benconi");

        expected.add(book1);
        expected.add(book2);
        bookReader.getLibrary().add(book1);
        bookReader.getLibrary().add(book2);
        bookReader.removeBook(new Book("Metro 2033", null));

        System.out.println("Remove book test (NO) : " + result(expected.equals(bookReader.getLibrary())));
    }

    void test3() {
        BookReaderImpl bookReader = new BookReaderImpl();

        Book book1 = new Book("Metro 2033", "Dmitrij Gluhovskij");
        Book book2 = new Book("Florentijka", null);

        bookReader.getLibrary().add(book1);
        bookReader.getLibrary().add(book2);

        System.out.println("Remove book test (boolean true) : " + result
                (bookReader.removeBook(book1)));
        System.out.println("Remove book test (boolean false) : " + result
                (!bookReader.removeBook(book2)));
    }
}
