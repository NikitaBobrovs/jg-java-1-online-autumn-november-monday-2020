package students.jana_sergejenko.lesson_10.level_6.task_19_24;

import java.util.Arrays;
import java.util.Optional;

public class BookReaderImpl implements BookReader {
    private final Book[] books = new Book[10];
    private int i = 0;

    @Override
    public boolean save(Book book) {
        if (!findByTitleAndAuthor(book.getTitle(), book.getAuthor())) {
            if ((book.getTitle() != " ") && (book.getAuthor() != " ")) {
                books[i] = book;
                i++;
                return true;
            }
        }
        return false;
    }

    public void printAll() {
        System.out.println("save" + Arrays.toString(books));
    }

    @Override
    public boolean findByTitleAndAuthor(String title, String author) {
        for (Book book : books) {
            if ((book != null && (book.getTitle().equals(title)) && (book.getAuthor().equals(author)))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        int i = 0;
        for (i = 0; i < books.length; i++) {
            if (findByTitleAndAuthor(book.getTitle(), book.getAuthor())) {
                books[i] = null;
                return true;
            }
            break;

        }

        return false;
    }

   /* @Override
    public Book findByAuthor(String author) {
        for (Book book : books) {
            if (book != null && book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Book findByAuthor2(String author) {
        for (Book book : books) {
            if (book != null && book.getAuthor().contains(author)) {
                return book;
            }
        }
        return null;
    }*/

       public Optional<Book> findByAuthor(String author){
           for(Book book:books){
               if(book != null&&book.getAuthor().equals(author)){
                   return Optional.of(book);
               }
           }
           return Optional.empty();
       }

   /* @Override
    public Book findByTitle(String title) {
        for (Book book : books) {
            if (book != null && book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Book findByTitle2(String title) {
        for (Book book : books) {
            if (book != null && book.getTitle().contains(title)) {
                return book;
            }
        }
        return null;
    }*/

    public Optional<Book> findByTitle(String title){
        for(Book book:books){
            if(book != null&&book.getTitle().equals(title)){
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }


    @Override
    public boolean setMarkRead(Book book) {
        int i = 0;
        for (i = 0; i < books.length; i++) {
            if (findByTitleAndAuthor(book.getTitle(), book.getAuthor())) {
                if (books[i] != null) {
                    books[i].setRead(true);
                }
                return true;
            }
            break;

        }

        return false;
    }

    @Override
    public boolean setMarkNotRead(Book book) {
        int i = 0;
        for (i = 0; i < books.length; i++) {
            if (findByTitleAndAuthor(book.getTitle(), book.getAuthor())) {
                if (books[i] != null) {
                    books[i].setRead(false);
                }
                return true;
            }
            break;

        }

        return false;
    }

    public Book allRead() {
        for (Book book : books) {
            if (book != null && book.getRead() == true) {
                return book;
            }
        }
        return null;
    }

    public Book allNotRead() {
        for (Book book : books) {
            if (book != null && book.getRead() == false) {
                return book;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        BookReader test = new BookReaderImpl();
        Book book = new Book("Becoming", "Michelle Obama");
        test.save(book);
        Book book1 = new Book("One way", "Michelle Obama");
        test.save(book1);
        //test.printAll();
        //test.delete(book);
        test.printAll();
        //System.out.println(test.findByAuthor("Michelle Obama"));
        //System.out.println(test.findByAuthor("Michelle James"));
        test.setMarkRead(book1);
        System.out.println(test.allRead());
        test.setMarkRead(book);
        System.out.println(test.allNotRead());

        /*test.printAll();
        Book book2 = new Book("American Grown", "James Green");
        test.save(book2);
        test.printAll();
        Book book3 = new Book("One way", "James Green");
        test.save(book3);
        test.printAll();
        Book book4 = new Book("Becoming", "Michelle Obama");
        test.delete(book);
        System.out.println(test.findByTitleAndAuthor("Becoming", "Michelle Obama"));
        test.printAll();*/
    }
}
