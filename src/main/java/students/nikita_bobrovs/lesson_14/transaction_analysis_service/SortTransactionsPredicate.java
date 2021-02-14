package students.nikita_bobrovs.lesson_14.transaction_analysis_service;

import java.util.List;

public interface SortTransactionsPredicate {
    List<Transaction> sort(List<Transaction> transactions);
}
