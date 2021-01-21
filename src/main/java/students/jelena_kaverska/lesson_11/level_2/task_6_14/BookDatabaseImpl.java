package students.jelena_kaverska.lesson_11.level_2.task_6_14;

import java.util.*;

import static java.util.stream.Collectors.*;

class BookDatabaseImpl implements BookDatabase {
    private List<Book> books = new ArrayList<>();
    private Long bookId = 0L;

    @Override
    public Long save(Book book) {
        books.add(book);
        bookId++;
        book.setId(bookId);
        return bookId;
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        return books.removeIf(b -> b.equals(book));
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        return books.stream()
                .filter(b -> b.getId().equals(bookId))
                .findAny();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<Book> findByTitle(String title) {
        return books.stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title))
                .collect(toList());
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    //удаления всех книг указанного автора из библиотеки
    @Override
    public void deleteByAuthor(String author) {
        books.removeIf(book -> book.getAuthor().equalsIgnoreCase(author));
    }

    public void deleteByAuthor3(String author) {
        List<Book> toRemove = books.stream()
                .filter(b -> b.getAuthor().equalsIgnoreCase(author))
                .collect(toList());
        books.removeAll(toRemove);
    }

    @Override
    public void deleteByTitle(String title) {
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    public List<Book> findByAuthor1(String author) {
        return books.stream()
                .filter(b -> b.getAuthor().equalsIgnoreCase(author))
                .collect(toList());
    }

    public Optional<Book> findById1(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    public boolean deleteWhile(Long bookId) {
        Iterator<Book> itr = books.iterator();
        while (itr.hasNext()) {
            Book book = itr.next();
            if (book.getId().equals(bookId)) {
                itr.remove();
                return true;
            }
        }
        return false;
    }

    public boolean delete2(Long bookId) {
        return books.removeIf(book -> book.getId().equals(bookId));
    }

    public List<Book> getBooks() {
        return books;
    }

    public Long getBookId() {
        return bookId;
    }
}

class My {
    public static void main(String[] args) {
        BookDatabaseImpl db = new BookDatabaseImpl();
        System.out.println(db.getBooks());
        System.out.println(db.save(new Book("aa", "bb")));
        System.out.println(db.save(new Book("cc", "dd")));
        System.out.println(db.save(new Book("cc", "dd")));
        System.out.println(db.getBooks());

        System.out.println(db.countAllBooks());

        db.deleteByAuthor3("cc");
        System.out.println(db.getBooks());
        System.out.println(db.countAllBooks());
    }
}