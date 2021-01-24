package students.jana_sergejenko.lesson_10.level_6.task_19;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.scenario1();
        demo.scenario2();
        demo.scenario3();
        demo.scenario4();
        demo.scenario5();
        demo.scenario6();
        demo.scenario7();
        demo.scenario8();
        demo.scenario9();
        demo.scenario10();
        demo.scenario11();
        demo.scenario12();
    }

    public String checkResult(boolean result, boolean expected) {
        if (result == expected) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }
    public String checkResult2(Book result, Book expected) {
        if (result == expected) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }


    public void scenario1() {
        BookReader test = new BookReaderImpl();
        final Book book = new Book("Becoming", "Michelle Obama");
        boolean result = test.save(book);
        boolean expected = true;
        System.out.println("test" + checkResult(result, expected));

    }

    public void scenario2() {
        BookReader test = new BookReaderImpl();
        final Book book = new Book("Becoming", "Michelle Obama");
        final Book book2 = new Book("Becoming", "Michelle Obama");
        test.save(book);
        boolean result = test.save(book2);
        boolean expected = false;
        System.out.println("test" + checkResult(result, expected));
        test.printAll();
    }

    public void scenario3() {
        BookReader test = new BookReaderImpl();
        final Book book = new Book("Becoming", "Michelle Obama");
        final Book book2 = new Book("Becoming", "Michelle Obama");
        final Book book3 = new Book(" ", " ");
        test.save(book);
        test.save(book2);
        boolean result = test.save(book3);
        boolean expected = false;
        System.out.println("test" + checkResult(result, expected));
        test.printAll();
    }

    public void scenario4() {
        BookReader test = new BookReaderImpl();
        final Book book = new Book("Becoming", "Michelle Obama");
        final Book book2 = new Book("Becoming", "Michelle Obama");
        final Book book3 = new Book("Game", " ");
        test.save(book);
        test.save(book2);
        boolean result = test.save(book3);
        boolean expected = false;
        System.out.println("test" + checkResult(result, expected));
        test.printAll();
    }

    public void scenario5() {
        BookReader test = new BookReaderImpl();
        Book book = new Book("Becoming", "Michelle Obama");
        test.save(book);
        Book book1 = new Book("One way", "Michelle Obama");
        test.save(book1);
        test.printAll();
        boolean result = test.delete(book);
        boolean expected = true;
        System.out.println("DELETE test" + checkResult(result, expected));
    }

    public void scenario6() {
        BookReader test = new BookReaderImpl();
        Book book = new Book("Becoming", "Michelle Obama");
        test.save(book);
        Book book1 = new Book("One way", "Michelle Obama");
        Book book2 = new Book("Road", "James White");
        test.save(book1);
        test.printAll();
        boolean result = test.delete(book2);
        boolean expected = false;
        System.out.println(test.findByTitleAndAuthor("Road", "James White"));
        System.out.println(test.delete(book2));
        System.out.println("DELETE test" + checkResult(result, expected));
    }

    public void scenario7() {
        BookReader test = new BookReaderImpl();
        final Book book = new Book("Becoming", "Michelle Obama");
        test.save(book);
        Book result=test.findByAuthor("Michelle Obama");
        Book expected=book;
        System.out.println("Find test" + checkResult2(result, expected));
    }
    public void scenario8() {
        BookReader test = new BookReaderImpl();
        final Book book = new Book("Becoming", "Michelle Obama");
        test.save(book);
        Book result=test.findByAuthor("Michelle James");
        Book expected=null;
        System.out.println("Find test" + checkResult2(result, expected));
    }
    public void scenario9() {
        BookReader test = new BookReaderImpl();
        final Book book = new Book("Becoming", "Michelle Obama");
        test.save(book);
        Book result=test.findByAuthor2("Obama");
        Book expected=book;
        System.out.println("Find CONTAINS test" + checkResult2(result, expected));
    }
    public void scenario10() {
        BookReader test = new BookReaderImpl();
        final Book book = new Book("Becoming", "Michelle Obama");
        test.save(book);
        Book result=test.findByAuthor2("Michelle Obama");
        Book expected=book;
        System.out.println("Find CONTAINS test" + checkResult2(result, expected));
    }
    public void scenario11() {
        BookReader test = new BookReaderImpl();
        final Book book = new Book("Becoming", "Michelle Obama");
        test.save(book);
        Book result=test.findByTitle("Becoming");
        Book expected=book;
        System.out.println("Find by title test" + checkResult2(result, expected));
    }
    public void scenario12() {
        BookReader test = new BookReaderImpl();
        final Book book = new Book("Becoming", "Michelle Obama");
        test.save(book);
        Book result=test.findByTitle("Becoming true");
        Book expected=null;
        System.out.println("Find by title test" + checkResult2(result, expected));
    }
}

