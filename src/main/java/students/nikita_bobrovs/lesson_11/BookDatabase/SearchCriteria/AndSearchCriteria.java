package students.nikita_bobrovs.lesson_11.BookDatabase.SearchCriteria;

import students.nikita_bobrovs.lesson_11.BookDatabase.Book;

public class AndSearchCriteria implements SearchCriteria {

    private final SearchCriteria leftCondition;
    private final SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition, SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        return (leftCondition.match(book) && rightCondition.match(book));
    }
}
