package students.jelena_kaverska.lesson_10.level_5.task_13_18;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {
    private List<Book> books = new ArrayList<>();

    //в электронную библиотеку уствойства нельзя добавлять
    //одинаковые книги (книги у которых автор и название совпадают)
    @Override
    public boolean add(Book book) {
        if (!books.contains(book) && book.getAuthor() != null && book.getTitle() != null &&
                !book.getAuthor().isBlank() && !book.getTitle().isBlank()) {
            books.add(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().contains(author)) {
                results.add(book);
            }
        }
        return results;
    }
}

class MyDemo {
    public static void main(String[] args) {
        BookReaderImpl br = new BookReaderImpl();
        System.out.println("All books: " + br.getAllBooks());

        Book b1 = new Book("Atlas Shrugged", "Ayn Rand");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("AAA", "BBB");

        System.out.println(br.add(b1));
        System.out.println(br.add(b2));
        System.out.println(br.getAllBooks());

        System.out.println("false : " + br.add(b2));
        System.out.println(br.getAllBooks());
        System.out.println(br.findByAuthor("well"));


        System.out.println("del 1: " + br.delete(b1));
        System.out.println(br.getAllBooks());
        System.out.println("del 2: " + br.delete(b2));
        System.out.println(br.getAllBooks());
        System.out.println(br.add(new Book(" ", " ")));
        System.out.println("del 3: " + br.delete(b3));

    }
}