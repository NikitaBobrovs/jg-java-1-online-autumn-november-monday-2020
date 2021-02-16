package students.viktors_cesnokovs.lesson_10.level_6.task_19;

import java.util.ArrayList;
import java.util.List;

class ReadBooksTest {
    public static void main(String[] args) {
        ReadBooksTest readBooksTest = new ReadBooksTest();
        readBooksTest.test1();
        readBooksTest.test2();
    }

    private String result(boolean test) {
        if (test) {
            return "PASSED";
        } else
            return "FAILED";
    }

    Book book1 = new Book("Metro 2033", "Dmitrij Gluhovskij");
    Book book2 = new Book("Metro 2034", "Dmitrij Nikolaev");
    Book book3 = new Book("Metro 2035", "Anton Erzhevskij");
    Book book4 = new Book("Metro 2036", "Andrej Neznanin");

    private void bookList(List<Book> bookList) {
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
    }

    void test1() {
        book2.setRead(true);
        book4.setRead(true);
        BookReaderImpl bookReader = new BookReaderImpl();
        bookList(bookReader.getLibrary());

        List<Book> expected = new ArrayList<>();
        expected.add(book2);
        expected.add(book4);

        System.out.println("Read books test (YES) : " + result
                (expected.equals(bookReader.readBooks())));
    }

    void test2() {
        book2.setRead(false);
        book4.setRead(false);
        BookReaderImpl bookReader = new BookReaderImpl();
        bookList(bookReader.getLibrary());

        List<Book> expected = new ArrayList<>();

        System.out.println("Read books test (NO) : " + result
                (expected.equals(bookReader.readBooks())));
    }
}
