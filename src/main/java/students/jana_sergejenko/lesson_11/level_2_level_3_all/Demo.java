package students.jana_sergejenko.lesson_11.level_2_level_3_all;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        Demo test = new Demo();
        test.saveBookId();
        test.deleteById();
        test.deleteBook();
        test.findById();
        test.findByAuthor();
        test.findByTitle();
        test.countAllBooks();
        test.deleteAuthor();
        test.deleteByTitle();


    }

    public String checkResult(boolean result, boolean expected) {
        if (result == expected) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public String checkResult1(Optional<Book> result, Optional<Book> expected) {
        if (result.equals(expected)) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public String checkResult2(List<Book> result, List<Book> expected) {
        if (expected.toString().equals(result.toString())) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public String checkResult3(int result, int expected) {
        if (result == expected) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    Book book1 = new Book("Kristin Hannah", "The Four Winds");
    Book book2 = new Book("Kristin Hannah", "Firefly Lane");
    Book book3 = new Book("Matt Haig", "The Midnight Library");
    Book book4 = new Book("Julia Quinn", "The Duke and I");
    Book book5 = new Book("Janet Skeslien Charles", "The Paris Library");
    Book book6 = new Book("The Sanatorium", "Sarah Pearse");

    void saveBookId() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        System.out.println(test.save(book1));
        System.out.println(test.save(book2));
        System.out.println(test.save(book3));
        System.out.println(test.save(book4));
        System.out.println(test.save(book5));
        System.out.println(test.save(book6));

    }

    void deleteById() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        Long id = test.save(book1);
        boolean expected = true;
        boolean result = test.delete(1L);
        System.out.println("deleteByID" + checkResult(result, expected));
    }

    void deleteBook() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(book1);
        boolean expected = true;
        boolean result = test.delete(book1);
        System.out.println("deleteBook" + checkResult(result, expected));
    }

    void findById() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        Long id = test.save(book1);
        Optional<Book> expected = Optional.of(book1);
        Optional<Book> result = test.findById(book1.getId());
        System.out.println("findById" + checkResult1(result, expected));
    }

    void findByAuthor() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(book1);
        test.save(book2);
        test.save(book3);
        List<Book> expected = new ArrayList<>(List.of(new Book(book1.getAuthor(), book1.getTitle()),
                new Book(book2.getAuthor(), book2.getTitle())));
        List<Book> result = test.findByAuthor("Kristin Hannah");
        System.out.println("findByAuthor" + checkResult2(result, expected));
        System.out.println(expected);
        System.out.println(result);
    }

    void findByTitle() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(book1);
        test.save(book2);
        test.save(book3);
        List<Book> expected = new ArrayList<>(List.of(new Book(book3.getAuthor(), book3.getTitle())));
        List<Book> result = test.findByTitle("The Midnight Library");
        System.out.println("findByTitle" + checkResult2(result, expected));
        System.out.println(expected);
        System.out.println(result);
    }

    void countAllBooks() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(book1);
        test.save(book2);
        test.save(book3);
        int result = test.countAllBooks();
        int expected = 3;
        System.out.println(test.countAllBooks());
        System.out.println("countAllBooks" + checkResult3(result, expected));
    }

    void deleteAuthor() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(book2);
        test.save(book3);
        test.deleteByAuthor("Kristin Hannah");
        List<Book> expected = new ArrayList<>();
        expected.add(book3);
        List<Book> result = test.printAll();
        System.out.println("deleteByAuthor" + checkResult2(result, expected));
        System.out.println(expected);
        System.out.println(result);

    }

    void deleteByTitle() {
        BookDatabaseImpl test = new BookDatabaseImpl();
        test.save(book2);
        test.save(book3);
        test.deleteByTitle("The Midnight Library");
        List<Book> expected = new ArrayList<>();
        expected.add(book2);
        List<Book> result = test.printAll();
        System.out.println("deleteByTitle" + checkResult2(result, expected));
        System.out.println(expected);
        System.out.println(result);
    }

}
