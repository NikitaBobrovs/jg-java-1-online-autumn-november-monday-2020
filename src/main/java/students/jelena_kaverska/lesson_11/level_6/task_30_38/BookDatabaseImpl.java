package students.jelena_kaverska.lesson_11.level_6.task_30_38;

import java.util.*;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

class BookDatabaseImpl implements BookDatabase {
    private List<Book> books = new ArrayList<>();
    private Long bookId = 0L;

    @Override
    public Long save(Book book) {
        bookId++;
        Book copy = new Book(bookId, book.getAuthor(), book.getTitle());
        books.add(copy);
        return bookId;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> booksByTitle = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                booksByTitle.add(book);
            }
        }
        return booksByTitle;
    }

    @Override
    public boolean delete(Long id) {
        return books.removeIf(book -> book.getId().equals(id));
    }

    @Override
    public boolean delete(Book book) {
        return books.removeIf(b -> b.equals(book));
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> map = new HashMap<>();
        for (String author : getUniqueAuthors()) {
            map.put(author, getBooksByAuthor(author));
        }
        return map;
    }

    public Set<String> getUniqueAuthors() {
        Set<String> uniqueAuthors = new HashSet<>();
        for (Book book : books) {
            uniqueAuthors.add(book.getAuthor());
        }
        return uniqueAuthors;
    }

    public List<Book> getBooksByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap1() {
        return books.stream()
                .collect(groupingBy(Book::getAuthor));
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> map = new HashMap<>();
        for (Book book : books) {
            Integer count = map.get(book.getAuthor());
            if (count == null) {
                count = 0;
                map.put(book.getAuthor(), 1);
            } else {
                map.put(book.getAuthor(), count + 1);
            }
        }
        return map;
    }

    @Override
    public Map<String, Long> getEachAuthorBookCount1() {
        return books.stream()
                .collect(groupingBy(Book::getAuthor, counting()));
    }


    public static void main(String[] args) {
        BookDatabaseImpl impl = new BookDatabaseImpl();
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book4 = new Book("Turgenev", "Mumu2");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        Book book5 = new Book("Turgenev", "Mumu");
        impl.save(book1);
        impl.save(book2);
        impl.save(book3);
        impl.save(book4);
        impl.save(book5);

        Map<String, List<Book>> fir = impl.getAuthorToBooksMap();
        Map<String, List<Book>> sec = impl.getAuthorToBooksMap1();
        System.out.println(fir.equals(sec));

        System.out.println(impl.getAllBooks());
        Map<String, Integer> fir1 = impl.getEachAuthorBookCount();
        System.out.println(fir1);
        Map<String, Long> sec2 = impl.getEachAuthorBookCount1();
        System.out.println(sec2);
    }
}