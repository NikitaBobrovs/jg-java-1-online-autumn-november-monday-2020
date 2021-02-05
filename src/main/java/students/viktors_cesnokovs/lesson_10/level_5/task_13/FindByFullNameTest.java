package students.viktors_cesnokovs.lesson_10.level_5.task_13;

import java.util.ArrayList;
import java.util.List;

class FindByFullNameTest {
    public static void main(String[] args) {
        FindByFullNameTest findByFullNameTest = new FindByFullNameTest();
        findByFullNameTest.test1();
        findByFullNameTest.test2();
    }

    private String result(boolean test) {
        if (test) {
            return "PASSED";
        } else
            return "FAILED";
    }

    Book book1 = new Book("Metro 2033", "Dmitrij Gluhovskij");
    Book book2 = new Book("Metro 2034", "Dmitrij Gluhovskij");
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

        System.out.println("Find book by full name (YES) : " + result
                (expected.equals(bookReader.findByAuthorFullName("Dmitrij Gluhovskij"))));
    }

    void test2() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookList(bookReader.getLibrary());

        List<Book> expected = new ArrayList<>();

        System.out.println("Find book by full name (NO) : " + result
                (expected.equals(bookReader.findByAuthorFullName("Igor Karkarov"))));
    }
}
