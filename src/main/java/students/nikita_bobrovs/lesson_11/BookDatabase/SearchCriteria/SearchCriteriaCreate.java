package students.nikita_bobrovs.lesson_11.BookDatabase.SearchCriteria;

import students.nikita_bobrovs.lesson_11.BookDatabase.Book;

public class SearchCriteriaCreate implements SearchCriteriaRunner{
    Book bookSrc;
    private final int userChosenCriteria;
    private final int userChosenParameter1;
    private final int userChosenParameter2;
    YearOfIssueSearchCriteria yearOfIssueSearchCriteria;
    TitleSearchCriteria titleSearchCriteria;
    AuthorSearchCriteria authorSearchCriteria;

    public SearchCriteriaCreate(Book book,
                                int userChosenCriteria,
                                int userChosenParameter1,
                                int userChosenParameter2)
    {
        this.bookSrc = book;
        this.userChosenCriteria = userChosenCriteria;
        this.userChosenParameter1 = userChosenParameter1;
        this.userChosenParameter2 = userChosenParameter2;

        this.authorSearchCriteria = new AuthorSearchCriteria(bookSrc.getAuthor());
        this.titleSearchCriteria = new TitleSearchCriteria(bookSrc.getTitle());
        this.yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria(bookSrc.getYearOfIssue());
    }

    SearchCriteria parameter1() {
        if (this.userChosenParameter1 == 1) {
            return authorSearchCriteria;
        } else if (this.userChosenParameter1 == 2) {
            return titleSearchCriteria;
        } else {
            return yearOfIssueSearchCriteria;
        }
    }

    SearchCriteria parameter2() {
        if (this.userChosenParameter2 == 1) {
            return authorSearchCriteria;
        } else if (this.userChosenParameter2 == 2) {
            return titleSearchCriteria;
        } else {
            return yearOfIssueSearchCriteria;
        }
    }

    @Override
    public boolean build() {
        if (this.userChosenCriteria == 1) {
            return new AndSearchCriteria(parameter1(), parameter2()).match(bookSrc);
        } else {
            return new OrSearchCriteria(parameter1(), parameter2()).match(bookSrc);
        }
    }

    @Override
    public boolean match(Book book) {
        return build();
    }
}
