package students.nikita_bobrovs.lesson_10.level_5.task_13;

import java.util.ArrayList;
import java.util.List;

class RemoveBookTest {
    public static void main(String[] args) {
        RemoveBookTest removeBookTest = new RemoveBookTest();
        removeBookTest.removeBookTest1();
        removeBookTest.removeBookTest2();
        removeBookTest.removeBookTest3();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }


    void removeBookTest1() {
        BookReaderImpl bookReader = new BookReaderImpl();
        List<Book> expected = new ArrayList<>();

        Book book1 = new Book("Harry Potter", "Nikolay Gogol");
        Book book2 = new Book("Magic Academy", "Stephane Mayer");

        expected.add(book1);
        bookReader.getLibrary().add(book1);
        bookReader.getLibrary().add(book2);

        bookReader.removeBook(book2);

        System.out.println("Remove books test (list check)(not null) : " + testResult
                (expected.equals(bookReader.getLibrary())));
    }

    void removeBookTest2() {
        BookReaderImpl bookReader = new BookReaderImpl();
        List<Book> expected = new ArrayList<>();
        Book book1 = new Book("Harry Potter", "Nikolay Gogol");

        expected.add(book1);
        bookReader.getLibrary().add(book1);
        bookReader.removeBook(new Book("Harry Potter", null));

        System.out.println("Remove book test (list check)(null) : " + testResult
                (expected.equals(bookReader.getLibrary())));
    }

    void removeBookTest3() {
        BookReaderImpl bookReader = new BookReaderImpl();

        Book book1 = new Book("Harry Potter", "Nikolay Gogol");
        Book book2 = new Book("Magic Academy", null);

        bookReader.getLibrary().add(book1);
        bookReader.getLibrary().add(book2);

        System.out.println("Remove book test (boolean result true) : " + testResult
                (bookReader.removeBook(book1)));
        System.out.println("Remove book test(boolean result false) : " + testResult
                (!bookReader.removeBook(book2)));
    }
}
