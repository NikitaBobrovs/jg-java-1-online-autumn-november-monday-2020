package students.nikita_bobrovs.lesson_11.book_database.search_criterias;

import students.nikita_bobrovs.lesson_11.book_database.Book;
import students.nikita_bobrovs.lesson_11.book_database.SearchCriteria;

class YearOfIssueSearchCriteria implements SearchCriteria {
    private final String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getYearOfIssue().equals(this.yearOfIssueToSearch);
    }
}
