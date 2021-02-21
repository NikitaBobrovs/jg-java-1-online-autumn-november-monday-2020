package students.viktors_cesnokovs.lesson_11.level_2.task_6_14;

import java.util.Objects;

class Book {
    private Long id;
    private final String title;
    private final String author;

    Book(Long id, String author, String title) {
        this.author = author;
        this.title = title;
        this.id = id;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
