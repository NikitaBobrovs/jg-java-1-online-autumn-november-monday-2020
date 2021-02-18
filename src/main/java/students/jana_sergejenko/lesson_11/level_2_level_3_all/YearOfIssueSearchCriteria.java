package students.jana_sergejenko.lesson_11.level_2_level_3_all;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {

            if (book.getYearOfIssue().equals(this.yearOfIssueToSearch)) {
                return true;
            }
        return false;
    }
}

