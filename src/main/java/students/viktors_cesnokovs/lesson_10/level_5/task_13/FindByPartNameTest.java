package students.viktors_cesnokovs.lesson_10.level_5.task_13;

import java.util.ArrayList;
import java.util.List;

class FindByPartNameTest {
    public static void main(String[] args) {
        FindByPartNameTest findByPartNameTest = new FindByPartNameTest();
        findByPartNameTest.test1();
        findByPartNameTest.test2();
    }

    private String result(boolean test) {
        if (test) {
            return "PASSED";
        } else
            return "FAILED";
    }

    Book book1 = new Book("Metro 2033", "Dmitrij Gluhovskij");
    Book book2 = new Book("Metro 2034", "Dmitrij Gregorian");
    Book book3 = new Book("Metro 2035", "Anton Erzhevskij");
    Book book4 = new Book("Metro 2036", "Andrej Neznanin");

    private void bookList(List<Book> bookList) {
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
    }

    void test1() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookList(bookReader.getLibrary());

        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);

        System.out.println("Find book by part name (YES) : " + result
                (expected.equals(bookReader.findByAuthorPartName("Dmitrij"))));
    }

    void test2() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookList(bookReader.getLibrary());

        List<Book> expected = new ArrayList<>();

        System.out.println("Find book by part name (NO) : " + result
                (expected.equals(bookReader.findByAuthorPartName("Igor"))));
    }
}
