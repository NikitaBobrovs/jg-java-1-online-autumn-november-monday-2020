package students.nikita_bobrovs.lesson_10.level_5.task_13;

import java.util.ArrayList;
import java.util.List;

class FindByAuthorFullNameTest {
    public static void main(String[] args) {
        FindByAuthorFullNameTest findByAuthorFullNameTest = new FindByAuthorFullNameTest();
        findByAuthorFullNameTest.findByAuthorFullNameTest1();
        findByAuthorFullNameTest.findByAuthorFullNameTest2();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    private final BookReader bookReader = new BookReaderImpl();
    private List<Book> bookList = new ArrayList<>();

    Book book1 = new Book("Harry Potter", "Nikolay");
    Book book2 = new Book("Magic Academy", "Nikolay");
    Book book3 = new Book("Henry", "Lerna");
    Book book4 = new Book("Jack R", "Leroy Jenkins");

    private void setBookList(List<Book> bookList) {
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        this.bookList = bookList;
    }

    void findByAuthorFullNameTest1() {
        setBookList(bookList);

        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);

        System.out.println("Find book by authors full name(not null) : " + testResult
                (expected.equals(bookReader.findByAuthorFullName("Nikolay", bookList))));
    }

    void findByAuthorFullNameTest2() {
        setBookList(bookList);

        List<Book> expected = new ArrayList<>();

        System.out.println("Find book by authors full name(null) : " + testResult
                (expected.equals(bookReader.findByAuthorFullName("Clark", bookList))));
    }
}
