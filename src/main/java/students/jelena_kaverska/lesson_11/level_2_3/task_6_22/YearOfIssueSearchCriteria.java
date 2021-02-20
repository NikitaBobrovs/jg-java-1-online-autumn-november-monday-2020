package students.jelena_kaverska.lesson_11.level_2_3.task_6_22;

class YearOfIssueSearchCriteria implements SearchCriteria{
    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override
    public boolean match(Book book) {
        return yearOfIssueToSearch.equals(book.getYearOfIssue());
    }
}