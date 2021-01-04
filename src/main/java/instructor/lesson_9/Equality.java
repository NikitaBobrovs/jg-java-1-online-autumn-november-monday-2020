package instructor.lesson_9;

import java.util.Objects;

public class Equality {

    public static void main(String[] args) {

        int a = 5;
        int b = 5;

        if (a == b) {
            System.out.println("EQUAl");
        }

        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = b1;

        if (b1 == b2) { // never happens

        }

        if (b1 == b3) { // always happens

        }

        if (b1.equals(b2)) { // should be ???

        }

        "foo".toLowerCase().toUpperCase().replaceAll("", "");

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            s.append(i);
        }
        s.toString();

    }
}

class Book {

    String isbn;
    String title;
    String author;
    String text;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title);
    }
}
