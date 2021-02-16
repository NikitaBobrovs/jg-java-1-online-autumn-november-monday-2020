package students.polina_ivashkevich.lesson_11.level_2.task_6;

import java.util.Objects;

public class Book {
    private final Long id;
    private final String title;
    private final String author;
    private final String yearOfIssue;

    public Book (String author, String title, String yearOfIssue) {
        this(null,author, title, yearOfIssue);
    }
         Book(Long id, String title, String author, String yearOfIssue) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
    }

    public Long getId() {
        return this.id;
    }
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public String getYearOfIssue() {
        return this.yearOfIssue;
    }

    @Override
    public boolean equals(Object object1) {
        if (this == object1)
            return true;
        if (object1 == null || getClass() != object1.getClass())
            return false;
        Book b = (Book) object1;
        return title.equals(b.title) && author.equals(b.author);

    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

}
