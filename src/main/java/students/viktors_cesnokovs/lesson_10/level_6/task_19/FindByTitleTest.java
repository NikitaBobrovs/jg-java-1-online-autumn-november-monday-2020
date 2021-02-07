package students.viktors_cesnokovs.lesson_10.level_6.task_19;

import java.util.ArrayList;
import java.util.List;

class FindByTitleTest {
    public static void main(String[] args) {
        FindByTitleTest findByTitleTest = new FindByTitleTest();
        findByTitleTest.test1();
        findByTitleTest.test2();
    }

    private String result(boolean test) {
        if (test) {
            return "PASSED";
        } else
            return "FAILED";
    }

    Book book1 = new Book("Metro 2033", "Dmitrij Gluhovskij");
    Book book2 = new Book("Metro 2034", "Dmitrij Nikolaev");
    Book book3 = new Book("Petro 2035", "Anton Erzhevskij");
    Book book4 = new Book("Zetro 2036", "Andrej Neznanin");

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

        System.out.println("Find book by title (YES) : " + result
                (expected.equals(bookReader.findByTitle("M"))));
    }

    void test2() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookList(bookReader.getLibrary());

        List<Book> expected = new ArrayList<>();

        System.out.println("Find book by title (NO) : " + result
                (expected.equals(bookReader.findByTitle("O"))));
    }
}
