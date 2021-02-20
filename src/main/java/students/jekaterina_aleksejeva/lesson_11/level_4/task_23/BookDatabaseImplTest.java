package students.jekaterina_aleksejeva.lesson_11.level_4.task_23;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

class BookDatabaseImplTest {
    public static void main(String[] args) {
        BookDatabaseImplTest test = new BookDatabaseImplTest();
        test.countedAllBooks();
        test.deletedByID();
        test.notDeletedByID();
        test.deletedBook();
        test.notDeletedBook();
        test.foundById();
        test.notFoundById();
        test.foundByAuthor();
        test.notFoundByAuthor();
        test.foundByTitle();
        test.notFoundByTitle();
        test.deletedByAuthor();
        test.notDeletedByAuthor();
        test.deletedByTitle();
        test.notDeletedByTitle();
        test.foundBySearchCriteria();
        test.notFoundBySearchCriteria();
    }

    BookDatabaseImpl database = new BookDatabaseImpl();
    Book b1 = new Book("k", "l");
    Book b2 = new Book("k", "c");
    Book b3 = new Book("m", "n");
    Book b4 = new Book("o", "p");
    Book b5 = new Book("w", "u");
    Book b6 = new Book("a", "n");
    Book b7 = new Book("e", "f");
    Book b8 = new Book("abc", "def", "1998");
    Book b9 = new Book("xyz", "ttt", "1915");

    boolean checkBooleanTest(boolean expectedResult, boolean actualResult) {
        return Objects.equals(expectedResult, actualResult);
    }

    void countedAllBooks() {
        String scenario = "Counted 3 books in total = ";
        database.save(b1);
        database.save(b2);
        database.save(b3);
        int expected = 3;
        int actual = database.countAllBooks();
        if (expected == actual) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void deletedByID() {
        String scenario = "Found and deleted by Id No 4 = ";
        database.save(b4);
        if (checkBooleanTest(true, database.delete(Long.valueOf(4)))) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void notDeletedByID() {
        String scenario = "No book found and deleted by Id No 10 = ";
        if (checkBooleanTest(false, database.delete(Long.valueOf(10)))) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void deletedBook() {
        String scenario = "Found and deleted b5 = ";
        database.save(b5);
        if (checkBooleanTest(true, database.delete(b5))) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void notDeletedBook() {
        String scenario = "Found and deleted no book = ";
        if (checkBooleanTest(false, database.delete(new Book("x", "y")))) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void foundById() {
        String scenario = "Found book by ID No 2 = ";
        Optional<Book> expected = Optional.of(b2);
        Optional<Book> actual = database.findById(b2.getId());
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void notFoundById() {
        String scenario = "Not found book by ID = ";
        Optional<Book> expected = Optional.empty();
        Optional<Book> actual = database.findById(new Book("s", "z").getId());
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void foundByAuthor() {
        String scenario = "Found by author k all books = ";
        List<Book> expected = new ArrayList<>(List.of(b1, b2));
        List<Book> actual = database.findByAuthor("k");
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void notFoundByAuthor() {
        String scenario = "Found by author u no books = ";
        List<Book> expected = new ArrayList<>();
        List<Book> actual = database.findByAuthor("u");
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void foundByTitle() {
        String scenario = "Found by title n all books = ";
        database.save(b6);
        List<Book> expected = new ArrayList<>(List.of(b3, b6));
        List<Book> actual = database.findByTitle("n");
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void notFoundByTitle() {
        String scenario = "Found by title j no books = ";
        List<Book> expected = new ArrayList<>();
        List<Book> actual = database.findByTitle("j");
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void deletedByAuthor() {
        String scenario = "Deleted all books by author k = ";
        List<Book> expected = new ArrayList<>(List.of(b3, b6));
        database.deleteByAuthor("k");
        List<Book> actual = database.getBookList();
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void notDeletedByAuthor() {
        String scenario = "Deleted no books by author s = ";
        database.save(b7);
        List<Book> expected = new ArrayList<>(List.of(b3, b6, b7));
        database.deleteByAuthor("s");
        List<Book> actual = database.getBookList();
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void deletedByTitle() {
        String scenario = "Deleted all books by title n = ";
        List<Book> expected = new ArrayList<>(List.of(b7));
        database.deleteByTitle("n");
        List<Book> actual = database.getBookList();
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void notDeletedByTitle() {
        String scenario = "Deleted no books by title y = ";
        List<Book> expected = new ArrayList<>(List.of(b7));
        database.deleteByTitle("y");
        List<Book> actual = database.getBookList();
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void foundBySearchCriteria() {
        String scenario = "Found by search criteria = ";
        database.save(b8);
        database.save(b9);
        SearchCriteria left = new TitleSearchCriteria("def");
        SearchCriteria right = new AuthorSearchCriteria("abc");
        SearchCriteria any = new OrSearchCriteria(left,right);
        List<Book> expected = new ArrayList<>(List.of(b8));
        List<Book> actual = database.find(any);
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void notFoundBySearchCriteria() {
        String scenario = "Found by search criteria no books = ";
        SearchCriteria left = new TitleSearchCriteria("555");
        SearchCriteria right = new YearOfIssueSearchCriteria("2000");
        SearchCriteria both = new AndSearchCriteria(left,right);
        List<Book> expected = new ArrayList<>();
        List<Book> actual = database.find(both);
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

}






