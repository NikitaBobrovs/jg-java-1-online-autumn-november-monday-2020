package students.nikita_bobrovs.lesson_11.book_database.search_criterias;

import students.nikita_bobrovs.lesson_11.book_database.Book;
import students.nikita_bobrovs.lesson_11.book_database.SearchCriteria;

public class SearchCriteriaCreate{
    Book bookSrc;
    private final int userChosenCriteria;
    private final int userChosenParameter1;
    private final int userChosenParameter2;
    private final YearOfIssueSearchCriteria yearOfIssueSearchCriteria;
    private final TitleSearchCriteria titleSearchCriteria;
    private final AuthorSearchCriteria authorSearchCriteria;

    public SearchCriteriaCreate(Book book,
                                int userChosenCriteria,
                                int userChosenParameter1,
                                int userChosenParameter2) {
        this.bookSrc = book;
        this.userChosenCriteria = userChosenCriteria;
        this.userChosenParameter1 = userChosenParameter1;
        this.userChosenParameter2 = userChosenParameter2;

        this.authorSearchCriteria = new AuthorSearchCriteria(bookSrc.getAuthor());
        this.titleSearchCriteria = new TitleSearchCriteria(bookSrc.getTitle());
        this.yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria(bookSrc.getYearOfIssue());
    }

    private SearchCriteria parameter1() {
        if (this.userChosenParameter1 == 1) {
            return authorSearchCriteria;
        } else if (this.userChosenParameter1 == 2) {
            return titleSearchCriteria;
        } else {
            return yearOfIssueSearchCriteria;
        }
    }

    private SearchCriteria parameter2() {
        if (this.userChosenParameter2 == 1) {
            return authorSearchCriteria;
        } else if (this.userChosenParameter2 == 2) {
            return titleSearchCriteria;
        } else {
            return yearOfIssueSearchCriteria;
        }
    }

    public SearchCriteria build() {
        if (this.userChosenCriteria == 1) {
            return new AndSearchCriteria(parameter1(), parameter2());
        } else {
            return new OrSearchCriteria(parameter1(), parameter2());
        }
    }
}
