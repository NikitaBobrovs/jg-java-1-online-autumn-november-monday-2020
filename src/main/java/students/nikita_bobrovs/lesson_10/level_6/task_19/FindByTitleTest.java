package students.nikita_bobrovs.lesson_10.level_6.task_19;

import java.util.ArrayList;
import java.util.List;

class FindByTitleTest {
    public static void main(String[] args) {
        FindByTitleTest findByTitleTest = new FindByTitleTest();
        findByTitleTest.findByTitleTest1();
        findByTitleTest.findByTitleTest2();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    private final BookReader bookReader = new BookReaderImpl();
    private List<Book> bookList = new ArrayList<>();

    private final Book book1 = new Book("Harry Potter", "Nikolay Gogol");
    private final Book book2 = new Book("Magic Academy", "Stephane Mayer");
    private final Book book3 = new Book("Henry", "Leroy J");
    private final Book book4 = new Book("Jack R", "Leroy Jenkins");

    private void setBookList(List<Book> bookList) {
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        this.bookList = bookList;
    }

    void findByTitleTest1() {
        setBookList(bookList);

        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book3);

        System.out.println("Find book by title (not null) : " + testResult
                (expected.equals(bookReader.findByTitle("H", bookList))));
    }

    void findByTitleTest2() {
        setBookList(bookList);

        List<Book> expected = new ArrayList<>();

        System.out.println("Find book by title (null) : " + testResult
                (expected.equals(bookReader.findByTitle("Bean", bookList))));
    }
}
