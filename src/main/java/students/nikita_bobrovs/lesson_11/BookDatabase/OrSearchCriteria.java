package students.nikita_bobrovs.lesson_11.BookDatabase;

public class OrSearchCriteria implements SearchCriteria{
    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition, SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        return (leftCondition.match(book) && rightCondition.match(book));
    }
}
