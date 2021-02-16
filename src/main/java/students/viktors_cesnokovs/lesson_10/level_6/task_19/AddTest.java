package students.viktors_cesnokovs.lesson_10.level_6.task_19;

import java.util.ArrayList;
import java.util.List;

class AddTest {
    public static void main(String[] args) {
        AddTest addTest = new AddTest();
        addTest.test1();
        addTest.test2();
        addTest.test3();
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
        expected.add(book2);
        bookReader.addBook(book1);
        bookReader.addBook(book2);

        System.out.println("Add books (YES) : " + result(expected.equals(bookReader.getLibrary())));
    }

    void test2() {
        BookReaderImpl bookReader = new BookReaderImpl();
        List<Book> expected = new ArrayList<>();

        Book book1 = new Book("Metro 2033", null);
        Book book2 = new Book(null, "Djuljeta Benconi");

        bookReader.addBook(book1);
        bookReader.addBook(book2);
        System.out.println("Add books (NO) : " + result(expected.equals(bookReader.getLibrary())));
    }

    void test3() {
        BookReaderImpl bookReader = new BookReaderImpl();

        Book book1 = new Book("Metro 2033", null);
        Book book2 = new Book("Florentijka", "Djuljeta Benconi");

        System.out.println("Add test 'boolean false' : " + result(!bookReader.addBook(book1)));
        System.out.println("Add test 'boolean true' : " + result(bookReader.addBook(book2)));
    }
}
