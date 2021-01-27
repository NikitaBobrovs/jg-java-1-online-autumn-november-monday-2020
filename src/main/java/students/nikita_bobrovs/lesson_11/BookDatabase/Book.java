package students.nikita_bobrovs.lesson_11.BookDatabase;

import java.util.Objects;

public class Book {
    private final Long id;
    private final String title;
    private final String author;
    private final String yearOfIssue;

    public Book(String author, String title, String yearOfIssue) {
        this(null, author, title, yearOfIssue);
    }

    Book(Long id, String author, String title, String yearOfIssue) {
        this.author = author;
        this.title = title;
        this.yearOfIssue = yearOfIssue;
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                '}';
    }
}
