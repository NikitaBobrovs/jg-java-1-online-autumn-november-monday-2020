package students.nikita_bobrovs.lesson_14.transaction_analysis_service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByValueHighToLowPredicate implements SortTransactionsPredicate {

    @Override
    public List<Transaction> sort(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue)
                        .reversed())
                .collect(Collectors.toList());
    }

}
