package students.jelena_kaverska.lesson_10.level_5.task_13_18;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {
    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

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
    public void print() {
        if (!books.isEmpty()) {
            for (Book book : books) {
                System.out.print(book.getTitle() + "[" + book.getAuthor() + "] ");
            }
            System.out.println();
        }
        System.out.println("[]");
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
        br.print();
        System.out.println(br.add(new Book("Atlas Shrugged", "Ayn Rand")));
        br.print();
        System.out.println(br.add(new Book("1984", "George Orwell")));
        br.print();
        System.out.println(br.add(new Book("Atlas Shrugged", "Ayn Rand")));
        br.print();
        System.out.println(br.findByAuthor(" Rand"));


        System.out.println("del 1: " + br.delete(new Book("Atlas Shrugged", "Ayn Rand")));
        br.print();
        System.out.println("del 2: " + br.delete(new Book("1984", "George Orwell")));
        br.print();
        System.out.println(br.add(new Book(" ", " ")));
        br.print();
    }
}