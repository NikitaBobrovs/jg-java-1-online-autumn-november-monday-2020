package students.nikita_bobrovs.lesson_10.level_5.task_13;

import java.util.List;

class GetAllBooksTest {
    public static void main(String[] args) {
        GetAllBooksTest getAllBooksTest = new GetAllBooksTest();
        getAllBooksTest.GetAllBooksTest1();
    }

    private String testResult(boolean tester){
        return tester ? "OK" : "FAIL";
    }

    Book book1 = new Book("Harry Potter", "Nikolay");
    Book book2 = new Book("Magic Academy", "Nikolay");
    Book book3 = new Book("Henry", "Lerna");
    Book book4 = new Book("Jack R", "Leroy Jenkins");

    private void setBookList(List<Book> bookList) {
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
    }

    void GetAllBooksTest1(){
        BookReaderImpl bookReader = new BookReaderImpl();
        setBookList(bookReader.getLibrary());

        System.out.println("Get all books test : "+testResult
                (bookReader.getLibrary().equals(bookReader.getAllBooks())));
    }
}
