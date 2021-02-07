package students.viktors_cesnokovs.lesson_10.level_6.task_19;

class Book {
    private final String author;
    private final String title;
    private boolean isRead;
    private boolean isNotRead;

    Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public boolean isNotRead() {
        return isNotRead;
    }

    public void setNotRead(boolean notRead) {
        isNotRead = notRead;
    }

    public String toString() {
        return "Book - " +
                "author : " + author + '\'' +
                " ; name : " + title + '\'';
    }
}
