package students.nikita_bobrovs.lesson_11.BookDatabase;

import students.nikita_bobrovs.lesson_11.BookDatabase.SearchCriteria.SearchCriteriaRunner;

import java.util.*;

public class DatabaseImpl implements BookDatabase {
    List<Book> bookList = new ArrayList<>();
    private long bookId = 1;

    @Override
    public Long save(Book book) {
        Book copy = new Book(bookId, book.getAuthor(), book.getTitle(), book.getYearOfIssue());
        bookList.add(copy);
        bookId++;
        return copy.getId();
    }

    @Override
    public boolean deleteById(Long bookId) {
        return bookList.removeIf(book -> book.getId().equals(bookId));
    }

    @Override
    public boolean delete(Book book) {
        return bookList.removeIf(book::equals);
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> byAuthor = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                byAuthor.add(book);
            }
        }
        return byAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> byTitle = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                byTitle.add(book);
            }
        }
        return byTitle;
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        bookList.removeIf(book -> book.getAuthor().equals(author));
    }

    @Override
    public void deleteByTitle(String title) {
        bookList.removeIf(book -> book.getTitle().equals(title));
    }


    @Override
    public List<Book> find(SearchCriteriaRunner searchCriteria) {
        List<Book> bySearchCriteria = new ArrayList<>();
        for (Book book : bookList) {
            if (searchCriteria.match(book)) {
                bySearchCriteria.add(book);
            }
        }
        return bySearchCriteria;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> uniqueAuthors = new HashSet<>();
        for (Book book : bookList) {
            uniqueAuthors.add(book.getAuthor());
        }
        return uniqueAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uniqueTitles = new HashSet<>();
        for (Book book : bookList) {
            uniqueTitles.add(book.getTitle());
        }
        return uniqueTitles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(bookList);
    }

    @Override
    public boolean contains(Book book) {
        return bookList.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorToBook = new HashMap<>();
        for (Book book : bookList) {
            authorToBook.put(book.getAuthor(), findByAuthor(book.getAuthor()));
        }
        return authorToBook;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> authorBookCount = new HashMap<>();
        for (String author : findUniqueAuthors()) {
            authorBookCount.put(author, findByAuthor(author).size());
        }
        return authorBookCount;
    }
}
