package instructor.lesson_3;

public class BookDemo {

    public static void main(String[] args) {

        int a = 42;

        // Object 1
        System.out.println("Object 1: myBook");

        Book myBook = new Book();

        myBook.pagesCount = 150;
        System.out.println(myBook.pagesCount);

        myBook.pagesCount = 160;
        System.out.println(myBook.pagesCount);

        System.out.println(myBook.title);

        myBook.title = "Short Java Manual";

        System.out.println(myBook.title);

        // Object 2
        System.out.println("Object 2: yourBook");

        Book yourBook = new Book();

        yourBook.pagesCount = 20;
        System.out.println(yourBook.pagesCount);

        // Object 3
        System.out.println("Object 3: libraryBook");

        Book libraryBook = new Book();
        System.out.println(libraryBook.pagesCount);

        // Object 4
        System.out.println("Object 4: otherBook");

        Book otherBook;

    }
}
