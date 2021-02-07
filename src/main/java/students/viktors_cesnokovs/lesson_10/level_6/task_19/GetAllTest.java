package students.viktors_cesnokovs.lesson_10.level_6.task_19;

import java.util.List;

class GetAllTest {
    public static void main(String[] args) {
        GetAllTest getAllTest = new GetAllTest();
        getAllTest.test1();
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
        BookReaderImpl bookReader = new BookReaderImpl();
        bookList(bookReader.getLibrary());

        System.out.println("Get all books : " + result
                (bookReader.getLibrary().equals(bookReader.getAllBooks())));
    }
}
