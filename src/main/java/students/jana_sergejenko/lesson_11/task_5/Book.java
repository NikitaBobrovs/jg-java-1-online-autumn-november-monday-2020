package students.jana_sergejenko.lesson_11.task_5;

public class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        // now check the referenc of both object
        if (this == o) return true;
        // check the type of class
        if (o == null || o.getClass() != this.getClass()) return false;
        // now compare the value
        Book book = (Book) o;
        if (book.title == this.title && book.author.equals(this.author)) {
            return true;
        } else return false;
    }

    public int hashCode() {
        return title.hashCode();
    }
    /*@Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                "author='" + author + '\'' +
                '}';
    }*/

}