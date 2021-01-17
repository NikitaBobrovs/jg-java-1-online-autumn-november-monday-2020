package students.nikita_bobrovs.lesson_10.level_6.task_19;

import java.util.List;

class GetAllBooksTest {
    public static void main(String[] args) {
        GetAllBooksTest getAllBooksTest = new GetAllBooksTest();
        getAllBooksTest.getAllBooksTest1();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    private final Book book1 = new Book("Harry Potter", "Nikolay Gogol");
    private final Book book2 = new Book("Magic Academy", "Stephane Mayer");
    private final Book book3 = new Book("Henry", "Leroy J");
    private final Book book4 = new Book("Jack R", "Leroy Jenkins");

    private void setBookList(List<Book> bookList) {
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
    }

    void getAllBooksTest1() {
        BookReaderImpl bookReader = new BookReaderImpl();
        setBookList(bookReader.getLibrary());

        System.out.println("Get all books test : " + testResult
                (bookReader.getLibrary().equals(bookReader.getAllBooks())));
    }
}
