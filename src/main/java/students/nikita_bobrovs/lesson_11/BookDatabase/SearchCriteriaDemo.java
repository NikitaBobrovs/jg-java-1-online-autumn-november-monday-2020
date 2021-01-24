package students.nikita_bobrovs.lesson_11.BookDatabase;

class SearchCriteriaDemo {
    public static void main(String[] args) {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");

        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        AndSearchCriteria andSearchCriteria1 = new AndSearchCriteria(authorSearchCriteria,yearOfIssueSearchCriteria);

        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
    }
}
