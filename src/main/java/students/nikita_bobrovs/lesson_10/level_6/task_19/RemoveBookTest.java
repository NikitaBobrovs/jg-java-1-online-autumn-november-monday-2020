package students.nikita_bobrovs.lesson_10.level_6.task_19;

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

    BookReader bookReader = new BookReaderImpl();

    void removeBookTest1() {
        List<Book> expected = new ArrayList<>();
        List<Book> real = new ArrayList<>();
        Book book1 = new Book("Harry Potter", "Nikolay Gogol");
        Book book2 = new Book("Magic Academy", "Stephane Mayer");

        expected.add(book1);
        real.add(book1);
        real.add(book2);

        bookReader.removeBook(book2, real);

        System.out.println("Remove books test (list check)(not null) : " + testResult
                (expected.equals(real)));
    }

    void removeBookTest2() {
        List<Book> real = new ArrayList<>();
        List<Book> expected = new ArrayList<>();
        Book book1 = new Book("Harry Potter", "Nikolay Gogol");

        expected.add(book1);
        real.add(book1);

        bookReader.removeBook(new Book("Harry Potter", null), real);

        System.out.println("Remove book test (list check)(null) : " + testResult
                (expected.equals(real)));
    }

    void removeBookTest3() {
        List<Book> real = new ArrayList<>();
        Book book1 = new Book("Harry Potter", "Nikolay Gogol");
        Book book2 = new Book("Magic Academy", null);

        real.add(book1);
        real.add(book2);

        System.out.println("Remove book test (boolean result true) : " + testResult
                (bookReader.removeBook(book1, real)));
        System.out.println("Remove book test(boolean result false) : " + testResult
                (!bookReader.removeBook(book2, real)));
    }
}
