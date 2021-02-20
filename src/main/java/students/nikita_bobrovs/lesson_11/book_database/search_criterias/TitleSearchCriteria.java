package students.nikita_bobrovs.lesson_11.book_database.search_criterias;

import students.nikita_bobrovs.lesson_11.book_database.Book;
import students.nikita_bobrovs.lesson_11.book_database.SearchCriteria;

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
