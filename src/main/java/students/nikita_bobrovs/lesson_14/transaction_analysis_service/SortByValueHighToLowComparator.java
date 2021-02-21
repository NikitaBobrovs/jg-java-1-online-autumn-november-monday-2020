package students.nikita_bobrovs.lesson_14.transaction_analysis_service;

import java.util.Comparator;

public class SortByValueHighToLowComparator implements Comparator<Transaction> {
    @Override
    public int compare(Transaction value1, Transaction value2) {
        return value2.getValue() - value1.getValue();
    }
}
