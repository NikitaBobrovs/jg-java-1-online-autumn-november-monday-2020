package students.nikita_bobrovs.lesson_11.BookDatabase.SearchCriteria;

import students.nikita_bobrovs.lesson_11.BookDatabase.Book;

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
