package students.nikita_bobrovs.lesson_11.BookDatabase.SearchCriteria;

import students.nikita_bobrovs.lesson_11.BookDatabase.Book;

class TitleSearchCriteria implements SearchCriteria {
    private final String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }
    @Override
    public boolean match(Book book) {
        return book.getTitle().equals(this.titleToSearch);
    }
}
