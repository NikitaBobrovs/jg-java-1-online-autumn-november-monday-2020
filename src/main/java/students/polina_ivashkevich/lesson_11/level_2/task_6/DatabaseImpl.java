package students.polina_ivashkevich.lesson_11.level_2.task_6;

import java.util.*;

public  class DatabaseImpl implements BookDatabase {
List<Book> bookList = new ArrayList<>();
private long bookId = 2;

    @Override
    public Long save(Book book) {
        Book copy = new Book(bookId, book.getAuthor(), book.getTitle(), book.getYearOfIssue());
        bookList.add(copy);
        bookId++;
        return copy.getId();
    }

    @Override
    public boolean deleteById(Long bookId) {
        return bookList.removeIf(book -> book.getId().equals((bookId)));
    }

    @Override
    public boolean delete(Book book) {
        return bookList.removeIf(book :: equals);
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
    public void findByAuthor(String author) {
        List<Book> byAuthor = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                byAuthor.add(book);
            }
        }
    }

    @Override
    public List<Book> findByTitle(String title) {
        return null;
    }

    @Override
    public int countAllBooks() {
        return 0;
    }

    @Override
    public void deleteByAuthor(String author) {

    }

    @Override
    public void deleteByTitle(String title) {

    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        return null;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        return null;
    }

    @Override
    public Set<String> findUniqueTitles() {
        return null;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return null;
    }

    @Override
    public boolean contains(Book book) {
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        return null;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        return null;
    }

    @Override
    public List<Book> find() {
        return null;
    }
}

