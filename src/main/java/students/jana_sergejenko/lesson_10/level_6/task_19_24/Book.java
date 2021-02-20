package students.jana_sergejenko.lesson_10.level_6.task_19_24;

public class Book {
    private String title;
    private String author;
    private boolean read;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public boolean getRead() {
        return this.read;
    }

    public void setRead(boolean newRead) {
        this.read = newRead;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                "author='" + author + '\'' +
                '}';
    }
}
